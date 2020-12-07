package database;

import java.sql.Connection;

public class Connectiontest {

	public static void main(String[] args) {
		
		Dbconn connect = new Dbconn();
		
		if(connect.getConnection() != null) {
			System.out.println("성공!");
		}

	}

}
