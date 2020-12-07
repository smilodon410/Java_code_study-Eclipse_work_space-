package myhadoop.mappers;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import myhadoop.support.AirlinePerformanceParser;

public class DelayCountMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	
	// 사용자 지정 옵션 -D로 전달 되는 workType
	private String workType;
	// 맴 출력 값
	private final static IntWritable outputValue = new IntWritable(1);
	// 맵 출력 키
	private Text outputKey = new Text();
	
	// map 매서드 수행 이전에 옵션을 받아오기 위한 setup 메서드
	@Override
	protected void setup(Context context)
			throws IOException, InterruptedException {
		// 매퍼가 처음 실행될 때 단 한번 호출
		// 옵션을 받아와서 설정
		workType = context.getConfiguration().get("workType");
	}

	@Override
	protected void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		// header 는 중단
		if (key.get() == 0 && value.toString().contains("YEAR")) {
			return;
		}
		// csv 파싱(분석)
		AirlinePerformanceParser parser = new AirlinePerformanceParser(value);
		// 옵션 workType 에 의한 매핑 작업 분기
		// 로직을 분리
		if (workType.equals("departure")) {
			// 출발 지연 시간을 검사
			if (parser.getDepartureDelayTime() > 0) {
				// 출력 키 설정
				outputKey.set(parser.getYear() + "," + parser.getMonth());
				// 출력
				context.write(outputKey, outputValue);
			}
		} else if (workType.equals("arrival")) {
			if (parser.getArrivalDelayTime() > 0) {
				outputKey.set(parser.getYear() + "," + parser.getMonth());
				context.write(outputKey, outputValue);
			}
			
		}
	}
	
	
	
}
