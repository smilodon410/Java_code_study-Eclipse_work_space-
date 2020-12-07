package Pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.Dbconn;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Person;

public class Dao {
	
	private PreparedStatement pstmt = null;
	private ObservableList<Person> data = FXCollections.observableArrayList();
	private ResultSet rs = null;
	private int num = 0;
	
	public Dao() {
	}


	public ObservableList<Person> getData() {
		try {
			pstmt = Dbconn.conn.prepareStatement("SELECT * FROM EMP30");

			data = FXCollections.observableArrayList();
			rs = pstmt.executeQuery();

			while(rs.next()) {
				Person person = new Person();
				person.setNo(rs.getInt("No"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getString("age"));
				person.setSalary(rs.getString("salary"));

				data.add(person);
			}
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Dao.getData():Error on Building Data");
			return null;
		}
		return data;
	}

    public boolean deleteData(int no) throws Exception {

        try {

            pstmt = Dbconn.conn.prepareStatement("DELETE FROM EMP30 WHERE NO = ?");
            pstmt.setInt(1, no);
            pstmt.executeUpdate();

        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

	public boolean editPerson(Person person) throws Exception {
		Dbconn.conn.setAutoCommit(false);
		
		String sql = "UPDATE EMP30 SET NAME = ?, AGE = ?, SALARY = ? Where NO = ?";
		
		try {
			PreparedStatement pstmt = Dbconn.conn.prepareStatement(sql);
			
			pstmt.setString(1, person.getName());
			pstmt.setString(2, person.getAge());
			pstmt.setString(3, person.getSalary());
			pstmt.setInt(4, person.getNo());
			
			int success = pstmt.executeUpdate();
			
			if(success > 0)
				System.out.println("데이터 변경 성공");
			else
				System.out.println("데이터 변경 실패");

			pstmt.close();
			
			Dbconn.conn.commit();
		
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;

	}

	public boolean insertPerson(Person person) throws Exception {
		Dbconn.conn.setAutoCommit(false);
		int no = 0;
		String sql = "SELECT MAX(NO) FROM EMP30";
		
		pstmt = Dbconn.conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			no = rs.getInt(1);
		}
		if(rs != null) {
			rs.close();
		}
		
		sql = "INSERT INTO EMP30 VALUES(?, ?, ?, ?)";
		
		try {
			PreparedStatement pstmt = Dbconn.conn.prepareStatement(sql);
			
			pstmt.setInt(1, no + 1);
			pstmt.setString(2, person.getName());
			pstmt.setString(3, person.getAge());
			pstmt.setString(4, person.getSalary());
			
			pstmt.executeUpdate();
			
			pstmt.close();
			
			Dbconn.conn.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	

}


