package DB;

import java.sql.*;
public class PreparedStatementTest {
	public static void insert() {

		Connection conn = null; // DB연결된 상태(세션)을 담은 객체
		PreparedStatement pstm = null;  // SQL 문을 나타내는 객체

		try {

			String quary = "INSERT INTO EMP30 VALUES(?, ?, ?)";

			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(quary);

			pstm.setString(1, "홍길동");
			pstm.setInt(2, 26);
			pstm.setInt(3, 300);

			int success = pstm.executeUpdate();

			if(success > 0)
				System.out.println("데이터 입력 성공");
			else
				System.out.println("데이터 입력 실패");


		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}
