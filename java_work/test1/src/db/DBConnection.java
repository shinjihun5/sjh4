package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	public static final String JDBC_URL = "jdbc:mysql://192.168.0.38/word_quiz?serverTimezone=UTC";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "1234";
}


if (loginUser(id, pw)) {
    System.out.println("로그인 성공!");
} else {
    System.out.println("로그인 실패. 아이디 또는 비밀번호를 확인하세요.");
}
break;
default:
System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
break;
}
}
}

private static boolean loginUser(String id, String password) {
try (Connection connection = DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD)) {
String selectQuery = "SELECT * FROM users WHERE id = ? AND password = ?";
try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
preparedStatement.setString(1, id);
preparedStatement.setString(2, password);
ResultSet resultSet = preparedStatement.executeQuery();

return resultSet.next(); // 결과가 존재하면 true, 없으면 false 반환
}
} catch (SQLException e) {
e.printStackTrace();
}

return false;
}

