package AFA;

public class GuestBookEntry {
    private String name;
    private String message;
    private String password;  // 비밀번호 추가

    public GuestBookEntry(String name, String message, String password) {
        this.name = name;
        this.message = message;
        this.password = password;
    }

    // Getter, setter 추가

    public String getPassword() {
        return password;
    }

    // DB에 저장하는 메서드 추가
    public void saveToDB() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "your_username", "your_password")) {
            String sql = "INSERT INTO guestbook (name, message, password) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, name);
                statement.setString(2, message);
                statement.setString(3, password);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DB에서 글 삭제하는 메서드 추가
    public void deleteFromDB() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "your_username", "your_password")) {
            String sql = "DELETE FROM guestbook WHERE name = ? AND password = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, name);
                statement.setString(2, password);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class GuestBook {
    // 기존 코드 유지

    // DB에서 방명록 불러오기
    public void loadEntriesFromDB() {
        // 기존 코드 유지
    }

    // DB에서 글 삭제하는 메서드 추가
    public void deleteEntryFromDBWithPassword(String name, String password) {
        try (Connection connection = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD)) {
            String sql = "DELETE FROM guestbook WHERE name = ? AND password = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, name);
                statement.setString(2, password);
                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("방명록이 삭제되었습니다.");
                } else {
                    System.out.println("삭제할 방명록이 없거나 비밀번호가 일치하지 않습니다.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    // GuestBookSystem 클래스에서 "삭제" 메뉴 부분
case 3: // 방명록 - 삭제
    System.out.println(Font.BACKGROUND_WHITE + Font.FONT_GREEN + "                 [ 방 명 록 - 삭제 ]                 " + Font.RESET);
    System.out.println("삭제할 이름을 입력하세요: ");
    String deleteName = sc.next();
    System.out.println("비밀번호를 입력하세요: ");
    String deletePassword = sc.next();
    guestBook.deleteEntryFromDBWithPassword(deleteName, deletePassword);
    break;
public class GuestBookSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuestBook guestBook = new GuestBook();

        // DB에서 방명록 불러오기
        guestBook.loadEntriesFromDB();

        while (true) {
            System.out.println(" -----------------[ 메뉴를 선택해주세요 ]------------------");
            System.out.println("1.목록조회 | 2.등록 | 3.삭제 | 8.로그아웃 | 9.이전메뉴 | 0.종료");
            System.out.println(" ------------------------------------------------------");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();  // 개행 문자 처리

                switch (choice) {
                    case 1:
                        guestBook.viewEntries();
                        break;
                    case 2:
                        // 등록 로직 추가
                        break;
                    case 3:
                        System.out.print("삭제할 이름을 입력하세요: ");
                        String deleteName = scanner.nextLine();
                        System.out.print("비밀번호를 입력하세요: ");
                        String deletePassword = scanner.nextLine();
                        guestBook.deleteEntryFromDB(deleteName, deletePassword);
                        break;
                    case 8:
                        // 로그아웃 로직 추가
                        break;
                    case 9:
                        // 이전 메뉴로 돌아가는 로직 추가
                        break;
                    case 0:
                        // 종료 로직 추가
                        break;
                    default:
                        System.out.println("유효하지 않은 메뉴입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요.");
                scanner.nextLine();  // 입력 버퍼 비우기
            }
        }
    }
}