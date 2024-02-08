package ex03;

import java.util.Scanner;

/* 실수는 소수 두번째
 * 
 * 숫자를 입력받아 소수 둘째자리까지만 보여주세요
 * 
 */

public class Ex08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 입력");

		// nextLine 문자열 한줄
		// int 정수입력
		// double 실수입력
		// next 문자열 입력 빈공백 전까지
		double d = scan.nextDouble();
		System.out.println("d =" + d);

		// 25.421421
		//
		double trans_d = (int)(d * 100)/100.0;
		// = System.out.println("trans_d = " +(int)(d*100)/100.0);
		System.out.println("trans_d = " + trans_d);
		
	}

}
