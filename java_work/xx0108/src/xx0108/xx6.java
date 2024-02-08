package xx0108;

import java.util.Scanner;

public class xx6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 10시 10분 = 9시 25분
		// 0시 30분 = 23시 45분
		// 23시 40분 22시 55분
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		// System.out.println(h);
		// System.out.println(m);
		
		if(m < 45) {
			h = h-1;
			m = (m+60)-45;
		}
		
		 else {
			m = m - 45;
			} 
		System.out.println(h);
		System.out.println(m);
			
			
		}
		
		
	}
	

