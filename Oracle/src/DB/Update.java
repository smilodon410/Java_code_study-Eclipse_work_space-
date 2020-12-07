package DB;

import java.sql.*;

public class Update {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			String quary = "UPDATE EMP30 SET AGE = ?, SALARY = ? WHERE NAME = ?";

			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(quary);

			pstm.setInt(1, 17);
			pstm.setInt(2, 40);
			pstm.setString(3, "홍길동");
			
			
			int success = pstm.executeUpdate();

			if(success > 0)
				System.out.println("데이터 변경 성공");
			else
				System.out.println("데이터 변경 실패");
		
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}			

	}

}
