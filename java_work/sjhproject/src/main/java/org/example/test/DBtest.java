package org.example.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GuestbookEntry {
    private String content;

    public GuestbookEntry(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class Guestbook {
    private Connection connection;

    public Guestbook() {
        try {
            // SQLite 데이터베이스 연결
            String url = "jdbc:sqlite:guestbook.db";
            connection = DriverManager.getConnection(url);

            // 방명록 테이블 생성 (존재하지 않을 경우에만)
            String createTableQuery = "CREATE TABLE IF NOT EXISTS guestbook (id INTEGER PRIMARY KEY AUTOINCREMENT, content TEXT)";
            connection.createStatement().executeUpdate(createTableQuery);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addEntry(GuestbookEntry entry) {
        try {
            // 방명록 추가 쿼리
            String insertQuery = "INSERT INTO guestbook (content) VALUES (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, entry.getContent());
            preparedStatement.executeUpdate();
            System.out.println("방명록이 등록되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<GuestbookEntry> getEntries() {
        List<GuestbookEntry> entries = new ArrayList<>();

        try {
            // 방명록 조회 쿼리
            String selectQuery = "SELECT content FROM guestbook";
            ResultSet resultSet = connection.createStatement().executeQuery(selectQuery);

            while (resultSet.next()) {
                String content = resultSet.getString("content");
                entries.add(new GuestbookEntry(content));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entries;
    }

    // 나머지 메서드는 이전 코드와 동일합니다.
}

public class GuestbookApp {
    public static void main(String[] args) {
        Guestbook guestbook = new Guestbook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 방명록 등록");
            System.out.println("2. 방명록 조회");
            System.out.println("3. 방명록 삭제");
            System.out.println("4. 종료");

            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    System.out.print("방명록을 작성하세요: ");
                    String content = scanner.nextLine();
                    guestbook.addEntry(new GuestbookEntry(content));
                    break;
                case 2:
                    viewGuestbookMenu(guestbook, scanner);
                    break;
                case 3:
                    System.out.print("삭제할 방명록 번호를 입력하세요: ");
                    int deleteIndex = scanner.nextInt();
                    guestbook.deleteEntry(deleteIndex);
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("올바르지 않은 메뉴 선택입니다.");
            }

            System.out.println(); // 메뉴 출력 후 줄바꿈 추가
        }
    }

    private static void viewGuestbookMenu(Guestbook guestbook, Scanner scanner) {
        while (true) {
            List<GuestbookEntry> entries = guestbook.getEntries();
            guestbook.viewEntries();

            if (entries.isEmpty()) {
                System.out.println("조회할 방명록 글이 없습니다.");
                break;
            }

            System.out.print("조회할 방명록 번호를 선택하세요 (0은 돌아가기): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            if (choice == 0) {
                break;
            } else if (choice >=
            class GuestbookDatabase {
                private static final String URL = "jdbc:mysql://your_database_url";
                private static final String USERNAME = "your_database_username";
                private static final String PASSWORD = "your_database_password";

                public static Connection getConnection() throws SQLException {
                    return DriverManager.getConnection(URL, USERNAME, PASSWORD);
                }

                public static void addEntry(String content) {
                    try (Connection connection = getConnection();
                         PreparedStatement statement = connection.prepareStatement("INSERT INTO guestbook (content) VALUES (?)")) {
                        statement.setString(1, content);
                        statement.executeUpdate();
                        System.out.println("방명록이 등록되었습니다.");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                public static ArrayList<String> getEntries() {
                    ArrayList<String> entries = new ArrayList<>();
                    try (Connection connection = getConnection();
                         PreparedStatement statement = connection.prepareStatement("SELECT content FROM guestbook");
                         ResultSet resultSet = statement.executeQuery()) {
                        while (resultSet.next()) {
                            entries.add(resultSet.getString("content"));
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    return entries;
                }

                // 삭제 등 다른 메서드도 유사하게 작성 가능
            }

            public class GuestbookApp {
                // 이전 코드와 동일

                public static void main(String[] args) {
                    // GuestbookDatabase를 사용하여 데이터베이스 연동 코드 작성
                    // 이후에도 데이터베이스 연동 코드를 적절히 추가하여 사용하시면 됩니다.
                }
            }
        }
    }
}