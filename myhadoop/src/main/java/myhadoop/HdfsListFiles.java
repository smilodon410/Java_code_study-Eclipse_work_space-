package myhadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocatedFileStatus;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RemoteIterator;

// 사용법: HdfsListFiles 목적지
public class HdfsListFiles {

	public static void main(String[] args) {
		// 매개 변수 없으면 에러
		if (args.length != 1) {
			System.err.println("Usage: HdfsListFiles <dif>");
			System.exit(2);
		}
		
		// 설정 불러와서 파일 시스템 얻기
		Configuration conf = new Configuration();
		// 1번째 매개변수에서 목적지 dir 확보
		String dir = args[0];
		
		try {
			FileSystem hdfs = FileSystem.get(conf);
			Path path = new Path(dir);
			
			RemoteIterator<LocatedFileStatus> iter = hdfs.listFiles(path, true);
		
			//
			while(iter.hasNext()) {
				LocatedFileStatus status = iter.next();
				System.out.printf("%s, %s%n", status.isDirectory() ? "Directory": "File",
						status.getPath());
			}
		
		} catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
