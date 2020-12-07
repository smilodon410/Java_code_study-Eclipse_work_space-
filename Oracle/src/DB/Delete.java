package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			String quary = "DELETE FROM EMP30 WHERE NAME = ?";

			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(quary);

			pstm.setString(1, "홍길동");
			
			
			int success = pstm.executeUpdate();

			if(success > 0)
				System.out.println("데이터 삭제 성공");
			else
				System.out.println("데이터 삭제 실패");
		
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

	}

}

