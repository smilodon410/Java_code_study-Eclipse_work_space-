package myhadoop.Reducer;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

// 넘어온 키 D,년,월 or A,년,월의 형태에 따라 다른 출력 경로
public class DelayCountReducerMulti extends Reducer<Text, IntWritable, Text, IntWritable>{
	
	// 다중 출력을 위한 MultipleOutputs
	private MultipleOutputs<Text, IntWritable> mos;
	
	private Text outputKey = new Text();
	private IntWritable result = new IntWritable();
	
	@Override
	protected void setup(Reducer<Text, IntWritable, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		// 다중 출력을 위한 객체 초기화
		mos = new MultipleOutputs<Text, IntWritable>(context);
	}

	@Override
	protected void reduce(Text key, Iterable<IntWritable> values,
			Context context) throws IOException, InterruptedException {
		// D,년,월
		// A,년,월
		// output key -> 년,월
		// 키를 , 로 분리
		String[] columns = key.toString().split(",");
		// 실제 출력 키
		outputKey.set(columns[1] + "," + columns[2]);
		
		// 구분자( D, A )를 기준으로 출력 방향을 전환
		if (columns[0].equals("D")) {
			// 출력 방향을 departure
			// 지연 횟수 합산
			int sum = 0;
			for (IntWritable value:values) {
				sum += value.get();
			}
			// 출력 값을 설정
			result.set(sum);
			// 출력 -> 다중 출력의 departure
			mos.write("departure", outputKey, result);
		} else if (columns[0].equals("A")) {
			//
			int sum = 0;
			for (IntWritable value:values) {
				sum += value.get();
			}
			
			result.set(sum);
			mos.write("arrival", outputKey, result);
		}
	}

	@Override
	protected void cleanup(Context context)
			throws IOException, InterruptedException {
		mos.close();
	}
	
	
}
