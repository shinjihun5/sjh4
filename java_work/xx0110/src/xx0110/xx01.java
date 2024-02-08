package xx0110;

import java.util.Scanner;

public class xx01 {

	public static void main(String[] args) {
	
		String todolist[] = new String[100];
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		if(select == 1) {
			System.out.println("할일 추가 만들어야함.");
			todolist[0] = "공부";
			
		} else if(select == 2) {
			System.out.println("할일 삭제 만들어야함.");
			todolist[0] = "";
		
		} else if(select == 3) {
			System.out.println("우선순위 부여.");
		}
		else {
			break;
			
		}
		
	System.out.println(todolist[0]);
	}
	}
}
