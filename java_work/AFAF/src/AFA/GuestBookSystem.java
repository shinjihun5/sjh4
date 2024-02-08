package AFA;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;




class GuestBookEntry {
    private String name;
    private String message;

    public GuestBookEntry(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

class GuestBook {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";
    
    private static final Scanner scanner = new Scanner(System.in);
    private final ArrayList<GuestBookEntry> entries;

    public GuestBook() {
        this.entries = new ArrayList<>();
        loadEntriesFromDB();
    }

    public void loadEntriesFromDB() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "SELECT name, message FROM guestbook";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String name = resultSet.getString("name");
                        String message = resultSet.getString("message");
                        GuestBookEntry entry = new GuestBookEntry(name, message);
                        entries.add(entry);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    public void viewEntries() {
        if (entries.isEmpty()) {
            System.out.println("방명록이 없습니다.");
        } else {
            while (true) {
                System.out.println("===== 방명록 조회 =====");
                for (int i = 0; i < entries.size(); i++) {
                    System.out.println((i + 1) + ". " + entries.get(i).getMessage());
                }

                int lastMenuNumber = entries.size() + 1;
                System.out.println(lastMenuNumber + ". 돌아가기");

                try {
                    System.out.print("조회할 글 번호를 입력하세요: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine(); 

                    if (choice == lastMenuNumber) {
                        return;
                    }
                    System.out.println("===== 방명록 글 =====");
                    if (choice >= 1 && choice <= entries.size()) {
                        GuestBookEntry selectedEntry = entries.get(choice - 1);
                        System.out.println("작성자: " + selectedEntry.getName());
                        System.out.println("내용: " + selectedEntry.getMessage());
                        displaySubMenu(selectedEntry);
                    } else {
                        System.out.println("유효하지 않은 글 번호입니다.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("숫자를 입력해주세요.");
                    scanner.nextLine(); 
                }
            }
        }
    }

    private void displaySubMenu(GuestBookEntry selectedEntry) {
        while (true) {
           
            System.out.println("1. 수정하기");
            System.out.println("2. 삭제하기");
            System.out.println("3. 돌아가기");
            System.out.print("메뉴를 선택하세요: ");

            try {
                int subChoice = scanner.nextInt();
                scanner.nextLine();  

                switch (subChoice) {
                    case 1:
                        System.out.print("수정할 내용을 입력하세요: ");
                        String updatedMessage = scanner.nextLine();
                        selectedEntry.setMessage(updatedMessage);
                        System.out.println("방명록이 수정되었습니다.");
                        break;
                    case 2:
                        entries.remove(selectedEntry);
                        System.out.println("방명록이 삭제되었습니다.");
                        break;
                    case 3:
                        
                        return;
                    default:
                        System.out.println("유효하지 않은 메뉴입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요.");
                scanner.nextLine();  
            }
        }
    }

    public void deleteEntry(String name) {
        boolean entryFound = false;
        for (GuestBookEntry entry : entries) {
            if (entry.getName().equals(name)) {
                entries.remove(entry);
                entryFound = true;
                System.out.println("방명록이 삭제되었습니다.");
                break;
            }
        }

        if (!entryFound) {
            System.out.println("삭제할 방명록이 없습니다.");
        }
    }

	public void viewEntries() {
		// TODO Auto-generated method stub
		
	}
}

public class GuestBookSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuestBook guestBook = new GuestBook();

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
                      
                        break;
                    case 3:
                       
                        break;
                    case 4:
                        
                    default:
                        System.out.println("유효하지 않은 메뉴입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요.");
                scanner.nextLine();  
            }
        }
    }
}