package jdbc;
import java.sql.*;
import org.apache.log4j.Logger;

public class jdbctest {
//    static Logger logger = Logger.getLogger(jdbctest.class);

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

	static final String DB_URL = "jdbc:mysql://localhost:3306/day5?serverTimezone=UTC";

	

	static final String USERNAME = "root";

	static final String PASSWORD = "64046832a!";

	

	public static void main(String[] args) throws SQLException {

		Connection conn = null;

		Statement stmt = null;

		ResultSet rs = null;

		

		try {

			Class.forName(JDBC_DRIVER);

			conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

			stmt = conn.createStatement();

			

			String sql1 = "select * from professor";

			rs = stmt.executeQuery(sql1);

			while(rs.next()) {

				String belong = rs.getString("belong");

				String name = rs.getString("name");
				
				String phone = rs.getString("phone");

				System.out.println("name = "+ name +"  "+ belong + " " + phone);

			}

		}catch(SQLException se1) {

			se1.printStackTrace();

		}catch(Exception ex) {

			ex.printStackTrace();

		}finally {

			rs.close();

			stmt.close();

			conn.close();

		}

	}
}
