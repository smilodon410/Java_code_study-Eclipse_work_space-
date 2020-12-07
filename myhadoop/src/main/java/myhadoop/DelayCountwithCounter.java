package myhadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import myhadoop.Reducer.DelayCountReducer;
import myhadoop.mappers.DelayCountMapperwithCounter;

// Configured를 상속
// Tool 인터페이스를 구현한 드라이버 클래스는 ToolRunner를 이용 실행
public class DelayCountwithCounter extends Configured implements Tool{
	
	public static void main(String[] args) throws Exception {
		// Tool 인터페이스 실행
		int res = ToolRunner.run(new Configuration(), new DelayCountwithCounter(), args);
	}

	// 실제 Tool 인터페이스가 실행 해야 할 로직
	@Override
	public int run(String[] args) throws Exception {
		// 사용자 정의 옵션의 처리
		String[] otherArgs = new GenericOptionsParser(getConf(), args).getRemainingArgs();
		
		// 입출력 경로 확인
		if (otherArgs.length != 2 ) {
			System.err.println("Usage: DelayCountWithCounter <input> <output>");
			System.exit(2);
		}
		
		// 잡 객체 생성
		Job job = Job.getInstance(getConf(), "DelayCountWithCounter");
		// 파일 입출력 경로
		FileInputFormat.addInputPath(job, new Path(otherArgs[0]));
		FileOutputFormat.setOutputPath(job, new Path(otherArgs[1]));
		
		// 잡 클래서 설정
		job.setJarByClass(DelayCountwithCounter.class);
		job.setMapperClass(DelayCountMapperwithCounter.class);
		job.setReducerClass(DelayCountReducer.class);
		
		// 입출력 데이터 포맷
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		// 출력 키 값의 유형
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		// MR 실행
		job.waitForCompletion(true);
		
		return 0;
	}
	
	

}
