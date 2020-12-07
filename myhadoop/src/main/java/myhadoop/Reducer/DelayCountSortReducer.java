package myhadoop.Reducer;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

import myhadoop.support.DateKey;

public class DelayCountSortReducer extends Reducer<DateKey, IntWritable, DateKey, IntWritable>{
	// 다중 출력을 위한 MultipleOutputs
	private MultipleOutputs<DateKey, IntWritable> mos;
	
	// Reduce 출력 키, 값
	private DateKey outputKey = new DateKey();
	private IntWritable result = new IntWritable();
	
	
	@Override
	protected void cleanup(Context context)
			throws IOException, InterruptedException {
		// MultipleOutputs 닫기
		mos.close();
	}
	
	@Override
	protected void reduce(DateKey key, Iterable<IntWritable> values,
			Context context) throws IOException, InterruptedException {
		// key.getYear() -> "D,2010" or "A,2010"
		String [] columns = key.getYear().split(",");
		
		int sum = 0;
		Integer bMonth = key.getMonth();
		
		if (columns[0].equals("D")) {
			// 출발 지연 정보
			for (IntWritable value: values) {
				if (bMonth != key.getMonth()) {
					// 이전에 처리했던 키의 월 정보가 현재 처리하는 내용과 다르면 
					// 현재까지 합산 값을 출력으로 생성해서 출력
					result.set(sum);
					outputKey.setYear(key.getYear().substring(2));
					outputKey.setMonth(bMonth);
					mos.write("departure", outputKey, result);
					sum = 0;
				}
				sum += value.get();
				bMonth = key.getMonth();
			}
			if (key.getMonth() == bMonth) {
				outputKey.setYear(key.getYear().substring(2));
				outputKey.setMonth(key.getMonth());
				result.set(sum);
				mos.write("departure", outputKey, result);
			}
		} else {
			// 도착 지연 시간
			for (IntWritable value:values) {
				if (bMonth != key.getMonth()) {
					result.set(sum);
					outputKey.setYear(key.getYear().substring(2));
					outputKey.setMonth(bMonth);
					mos.write("arrival", outputKey, result);
					sum = 0;
				}
				sum += value.get();
				bMonth = key.getMonth();
			}
			
			if (key.getMonth() == bMonth) {
				outputKey.setYear(key.getYear().substring(2));
				outputKey.setMonth(key.getMonth());
				result.set(sum);
				mos.write("arrival", outputKey, result);
			}
		}
				
	}
	
	@Override
	protected void setup(Context context)
			throws IOException, InterruptedException {
		// MultipleOutputs 초기화
		mos = new MultipleOutputs<DateKey, IntWritable>(context);
	}
	
	
	

}
