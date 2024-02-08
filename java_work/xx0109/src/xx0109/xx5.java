package xx0109;

import java.util.Scanner;

public class xx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rowNum = sc.nextInt();
		/* 5
		 * 첫번째 줄에서는 한번반복 두번째는 두번
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		// i는2일때 j 1~9
		for( int i = 2; i<9; i++) {
			// System.out.print("i = " + i);
			for(int j=0; j< i+1; j++) {
				// System.out.print(" j = " + j);
		//		System.out.printf("%d x %d = %d&n", i, j, i*j);
			}
			System.out.println();
		}
	}
}
