
package xx0108;

import java.util.Scanner;

public class xx9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String te = sc.nextLine();
		
		// chartAt 입력값을 한줄씩 띄어서 출력
		
		System.out.println(te.charAt(0));
		System.out.println(te.charAt(1));
		System.out.println(te.charAt(2));
		// System.out.println(te.charAt(3));
		// System.out.println(te.charAt(4));
	
		String[] ar = { "ㄱ", "ㄴ", "ㄷ","ㄹ"};
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		// ar 괄호 안에 값을 , 순서대로 출력
		// String [] ar = 배열 차례대로 ar값 한줄씩 출력
	
		String c = "10 20 0 40";
		String test[] = c.split(" ");
		System.out.println(test[0]);
		System.out.println(test[1]);
		System.out.println(test[3]);
		System.out.println(test[2]);
		
		// c.split = 빈공백으로 자르는 것
	}
	
}
