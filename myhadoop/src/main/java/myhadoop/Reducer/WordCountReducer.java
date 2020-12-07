package myhadoop.Reducer;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

// Reducer : 맵핑 끝낸 데이터를 집계하는 단계
// Reducer 클래스를 상속
public class WordCountReducer 
	extends Reducer<Text,	// 리듀서 입력 키 타입 = 매퍼의 출력 키 다입
					IntWritable,	// 리듀서 입력 값의 타입 = 메퍼의 출력 값의 타입 
					Text,	// 리듀서 출력 키 타입 
					IntWritable>{	// 리듀 서 출력 값의 타입
	
	// 입력 (word, 1), (word, 1)
	// reduce 메서드에 전달한다
	
	private IntWritable result = new IntWritable();

	// 집계 작업을 수행하는 메서드
	@Override
	protected void reduce(Text key,
			Iterable<IntWritable> values,
			Context context) throws IOException, InterruptedException {
		// (word, 1) -> (word, (1, 1, 1, 1))
		int sum = 0;	// 합산 변수
		for (IntWritable value: values) {
			// 값을 뽑아서 합산
			sum += value.get();
		}
		
		result.set(sum);	// 출력 생성
		context.write(key, result);	// (단어, 집계 된 합) -> 출력
	}
	
	

}
