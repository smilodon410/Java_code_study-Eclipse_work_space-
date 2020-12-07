package DB;

import java.sql.*;

public class OracleTest {
	public static void main(String[] args)
	{
		Connection conn = null; 
		PreparedStatement pstm = null;  
		ResultSet rs = null;  

		try {
			String quary = "SELECT * FROM EMP30";

			conn = DBConnection.getConnection();	// CONNECTION DB랑 연동하는 클래스
			pstm = conn.prepareStatement(quary);	// PSTM 쿼리문을 실행하는 클래스
			rs = pstm.executeQuery();				// 쿼리문 실행해서 나온 결과를 저장하는 클래스

			
			System.out.println("NAME AGE SALARY");
			System.out.println("===============");

			while(rs.next()){
				String NAME = rs.getString("NAME");
				int AGE = rs.getInt("AGE");
				int SALARY = rs.getInt("SALARY");
				
				String result = NAME+" "+AGE+"   "+SALARY;
				System.out.println(result);
			}

		} catch (SQLException sqle) {
			System.out.println("SELECT문에서 예외 발생");
			sqle.printStackTrace();

		}finally{
			// DB 연결을 종료한다.
			try{
				if ( rs != null ) rs.close(); 
				if ( pstm != null ) pstm.close();   
				if ( conn != null ) conn.close(); 
			}catch(Exception e){
				throw new RuntimeException(e.getMessage());
			}

		}
	}
}