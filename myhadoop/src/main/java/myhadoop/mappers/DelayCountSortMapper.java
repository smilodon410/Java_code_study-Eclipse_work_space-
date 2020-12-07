package myhadoop.mappers;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import myhadoop.support.AirlinePerformanceParser;
import myhadoop.support.DateKey;

// 출력 키 주의!!
public class DelayCountSortMapper extends Mapper<LongWritable, Text, DateKey, IntWritable>{
	// 출력 키, 값
	private final static IntWritable outputValue = new IntWritable(1);
	private DateKey outputKey = new DateKey();
	
	@Override
	protected void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		// MultipleOutputs 로 처리
		// 분석
		AirlinePerformanceParser parser = new AirlinePerformanceParser(value);
		
		if (parser.getDepartureDelayTime()> 0) {
			outputKey.setYear("D," + parser.getYear());
			outputKey.setMonth(parser.getMonth());
			
			context.write(outputKey, outputValue);
		} 
		
		if (parser.getArrivalDelayTime() > 0) {
			outputKey.setYear("A," + parser.getYear());
			outputKey.setMonth(parser.getMonth());
			
			context.write(outputKey, outputValue);
		}
		
	}
	
}
