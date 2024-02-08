package xx0108;

import java.util.Scanner;

public class xx5 {
	
	public static void solution(int a) {
		 if( a>=90) {
		System.out.println("A 입니다.");
	}
		
		else if( a>=80) {
			System.out.println("B 입니다.");
		}
		else if( a>=70) {
			System.out.println("C 입니다.");
		} 
		else {
			System.out.println("D 입니다.");
		}
		
	}
	
	// 성적 출력하기 
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("a ="+a);
		int b = sc.nextInt();
		System.out.println("b ="+b);
		
		solution(a);
		solution(b);
		0
		/* if( a>=90) {
		System.out.println("A 입니다.");
	}
		
		else if( b>=80) {
			System.out.println("B 입니다.");
		}
		else if( b>=70) {
			System.out.println("C 입니다.");
		} */
				
	
	}

}
