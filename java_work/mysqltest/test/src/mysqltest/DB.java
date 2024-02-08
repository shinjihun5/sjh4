package mysqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import miniproject.INFO;

public class DB {

	public void insert(String todo) {
		System.out.println("DB에 할일입력넣기");
		
		// 예외.... 처리... DB 에다가 연결했는데 DB컴퓨터.. 켜져있다..
		// DB 아이디 비번... root 1234 틀리게 적었다...
		try {
			Connection con = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO todo"
					+ "(`할일`,`상태`) "
					+ "VALUES "
					+ "('?','준비') ");
		pstmt.setString(1, todo);
		pstmt.executeUpdate();		
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void select() {
		System.out.println("DB에 할일목록 보여주기");
		try {
			Connection con = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			PreparedStatement pstmt = con.prepareStatement("SELECT * FORM todo");
			ResultSet rs = pstmt.executeQuery();

		while(rs.next()) {
			System.out.print(rs.getInt("idx"));
			System.out.print(rs.getString("할일"));
			System.out.println(rs.getString("상태"));
		}
		
		}catch (Exception e) {
			e.printStackTrace();
	
		}
	}
}

