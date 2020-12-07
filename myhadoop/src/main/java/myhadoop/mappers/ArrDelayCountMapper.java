package myhadoop.mappers;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import myhadoop.support.AirlinePerformanceParser;

public class ArrDelayCountMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	
	// 맵의 출력 값
	private final static IntWritable outputvalue = new IntWritable(1);
	// 맵 출력 키를 설정하기 위한 객체
	private Text outputkey = new Text();
	@Override
	protected void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		// 이 경우, 첫 번째 행은 header -> 제거
		if (key.get() == 0 && value.toString().contains("year")) {
			return;
		}
		
		AirlinePerformanceParser parser  = new AirlinePerformanceParser(value);
		
		// 만약, department_delay > 0 보다 크면 출력 키: 년, 월  값: 1 -> 출력
		if (parser.getArrivalDelayTime() > 0) {
			outputkey.set(parser.getYear() + "," + parser.getMonth());
			context.write(outputkey, outputvalue);
		}
	}
	
	
	
}
