package db.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import db.DBConnection;
import db.user.UserVO;
import style.Font;

public class AAA {
	
	private Connection conn;
	private Statement stmt;
	private ResultSet re;
	private String sql;
	private PreparedStatement pre;

	
	public void aaa(String a, String b) {
		try {
			conn = DriverManager.getConnection(DBConnection.JDBC_URL,DBConnection.PASSWORD,DBConnection.USERNAME);
			sql = "INSERT INTO aaa ('id,'pw) VALUES (?,?)";
			
			pre = conn.prepareStatement(sql);
		}
	}

}

		


