package xx0109;

import java.util.Scanner;

public class xx4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; ;i++) {
			String temp = sc.nextLine();
			if( temp.equals("0 0"))
				 
				System.out.println("종료됩니다.");
			break; 			
		}
			// 인트를 스트링으로 변경하려면 
			int num1 = Integer.parseInt(temp.split("")[0]);
			int num2 = Integer.parseInt(temp.split("")[1]);
			// System.out.println("num1 = "+num1);
			// System.out.println("num2 = "+num2);

			
			
					System.out.println(temp);
			
		
		
	}
}
