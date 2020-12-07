package myhadoop.mappers;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import myhadoop.support.AirlinePerformanceParser;

// 입력 키: LongWirtable(행번호), 값: csv 한행 year, month, .....,
// 출력 키: 년, 월 -> (TEXT), 값: IntWritable 1
public class DeptDelayCountMapper 
	extends Mapper<LongWritable, Text, Text, IntWritable> {
	// 맵의 출력 값
	private final static IntWritable outputValue = new IntWritable(1);
	// 맵 출력 키를 설정하기 위한 객체
	private Text outputKey = new Text();
	@Override
	protected void map(LongWritable key,	// 입력의 행 번호
			Text value,	// 이 경우, csv 한행(, 로 구분된 문자열 
			Context context)	// MR의 전체 문맥
			throws IOException, InterruptedException {
		// 이 경우, 첫 번째 행은 header
		if (key.get() == 0 && value.toString().contains("YEAR") ) {
			// 헤더 라인이므로 중단 -> 리듀서로 전달되지 않음
			return;
		}
		
		AirlinePerformanceParser parser = new AirlinePerformanceParser(value);
		
		// 만약, department_delay > 0 보다 크면 출력 키: 년, 월  값: 1 -> 출력
		if (parser.getDepartureDelayTime() > 0) {
			// 출발 지연 상태
			// 출력 키 설정
			outputKey.set(parser.getYear() + "," + parser.getMonth());
			context.write(outputKey, outputValue);
		}
	}
	
	

}
