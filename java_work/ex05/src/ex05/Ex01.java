package ex05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] arge) {
		  Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        String result = n%2 == 0 ? " is even" : " is odd";
	        System.out.println(n+ (result));
	        
	}
}