package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] arge) {	
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if ((a % 4 == 0 && a % 100 != 0)  || a % 400 == 0 ) {
			System.out.println(1);
		}
		else{
			System.out.println(0);
	}
}
}