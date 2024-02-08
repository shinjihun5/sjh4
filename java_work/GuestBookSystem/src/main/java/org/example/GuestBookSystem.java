package org.example;

import java.util.ArrayList;
import java.util.Iterator;
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
    private final ArrayList<GuestBookEntry> entries;
    final Scanner scanner;

    public GuestBook() {
        this.entries = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addEntry(String name, String message) {
        GuestBookEntry entry = new GuestBookEntry(name, message);
        entries.add(entry);
        System.out.println("방명록이 등록되었습니다.");
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
                    scanner.nextLine();  // 개행 문자 처리

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
                } catch (Exception e) {
                    System.out.println("올바르지 않은 입력입니다.");
                    scanner.nextLine();  // 입력 버퍼 비우기
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
                scanner.nextLine();  // 개행 문자 처리

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
                        // 돌아가기
                        return;
                    default:
                        System.out.println("유효하지 않은 메뉴입니다.");
                }
            } catch (Exception e) {
                System.out.println("올바르지 않은 입력입니다.");
                scanner.nextLine();  // 입력 버퍼 비우기
            }
        }
    }

    public void deleteEntry(String name) {
        Iterator<GuestBookEntry> iterator = entries.iterator();
        while (iterator.hasNext()) {
            GuestBookEntry entry = iterator.next();
            if (entry.getName().equals(name)) {
                iterator.remove();
                System.out.println("방명록이 삭제되었습니다.");
                return;
            }
        }

        System.out.println("삭제할 방명록이 없습니다.");
    }

    public void loadEntriesFromDB() {

    }
}

public class GuestBookSystem {
    public static void main(String[] args) {
        GuestBook guestBook = new GuestBook();


        while (true) {
            System.out.println(" -----------------[ 메뉴를 선택해주세요 ]------------------");
            System.out.println("1.목록조회 | 2.등록 | 3.삭제 | 8.로그아웃 | 9.이전메뉴 | 0.종료");
            System.out.println(" ------------------------------------------------------");

            try {
                int choice = guestBook.scanner.nextInt();
                guestBook.scanner.nextLine();  // 개행 문자 처리

                switch (choice) {
                    case 1:
                        guestBook.viewEntries();
                        break;
                    case 2:
                        System.out.print("이름을 입력하세요: ");
                        String name = guestBook.scanner.nextLine();
                        System.out.print("메시지를 입력하세요: ");
                        String message = guestBook.scanner.nextLine();
                        guestBook.addEntry(name, message);
                        break;
                    case 3:
                        System.out.print("삭제할 이름을 입력하세요: ");
                        String deleteName = guestBook.scanner.nextLine();
                        guestBook.deleteEntry(deleteName);
                        break;
                    case 8:
                        // 로그아웃
                        System.out.println("로그아웃 되었습니다.");
                        return;
                    case 9:
                        // 이전메뉴
                        System.out.println("이전 메뉴로 돌아갑니다.");
                        break;
                    case 0:
                        // 종료
                        System.out.println("프로그램을 종료합니다.");
                        System.exit(0);
                    default:
                        System.out.println("유효하지 않은 메뉴입니다.");
                }
            } catch (Exception e) {
                System.out.println("올바르지 않은 입력입니다.");
                guestBook.scanner.nextLine();  // 입력 버퍼 비우기
            }
        }
    }
}
