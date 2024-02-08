package org.example.test;

import java.util.ArrayList;
import java.util.Scanner;

class GuestbookEntry{
    private String content;

    public GuestbookEntry(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class Guestbook{
    private ArrayList<GuestbookEntry> entries;

    public Guestbook() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(GuestbookEntry entry) {
        entries.add(entry);
        System.out.println("방명록이 등록되었습니다.");
    }

    public void viewEntries() {
        if (entries.isEmpty()) {
            System.out.println("조회할 방명록 글이 없습니다.");
        } else {
            System.out.println("방명록 목록:");
            for (int i = 0; i < entries.size(); i++) {
                System.out.println((i + 1) + ". " + entries.get(i).getContent());
            }
            System.out.println("0. 돌아가기");
        }
    }

    public void deleteEntry(int index) {
        if (entries.isEmpty()) {
            System.out.println("삭제할 방명록 글이 없습니다.");
        } else if (index >= 1 && index <= entries.size()) {
            entries.remove(index - 1);
            System.out.println("방명록이 삭제되었습니다.");
        } else {
            System.out.println("올바르지 않은 인덱스입니다.");
        }
    }

}

public class GuestbookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guestbook guestbook = new Guestbook();

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
            guestbook.viewEntries();

            if (guestbook.getEntries().isEmpty()) {
                System.out.println("조회할 방명록 글이 없습니다.");
                break;  // 방명록이 없으면 루프 탈출
            }

            System.out.print("조회할 방명록 번호를 선택하세요 (0은 돌아가기): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            if (choice == 0) {
                break;  // 0을 선택하면 루프 탈출
            } else if (choice >= 1 && choice <= guestbook.getEntries().size()) {
                System.out.println(guestbook.getEntries().get(choice - 1).getContent());
            } else {
                System.out.println("올바르지 않은 선택입니다.");
            }
        }
    }
}
