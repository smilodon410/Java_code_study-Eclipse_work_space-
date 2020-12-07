package myhadoop.mappers;

import java.util.StringTokenizer;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

// 매퍼는 Mapper 클래스를 상속 받아야 함
public class WordCountMapper extends Mapper<LongWritable, // 입력 키의 타입(데이터의 라인 넘버)
											Text,	// 입력 값의 타입
											Text,	// 출력 키의 타입
											IntWritable> {	// 출력의 값의 타입
	// I am going home
	// -> k: 0, v: I am going home
	// 출력 (I, 1), (am, 1), (going, 1), (home, 1)
	private final static IntWritable outputValue = new IntWritable(1);
	private Text word = new Text();
	
	// 실제 매핑 작업을 수행할 매서드
	@Override
	protected void map(LongWritable key,	// 입력 키의 타입
			Text value,	// 입력 값의 타입
			Context context)	// MapReduce 전체 작업의 흐름
			throws IOException, InterruptedException {
		// k: 0, v: I am going home
		// value 를 분절
		StringTokenizer st = new StringTokenizer(value.toString());	// 입력 값을 공백문자로 분절
		// 매퍼의 출력 ( 단어, 1 )
		while (st.hasMoreElements()) {
			word.set(st.nextToken());	// 키로 사용할 단어
			// context에 출력
			context.write(word, outputValue);	// 출력(단어, 1)
		}
	}


}	
