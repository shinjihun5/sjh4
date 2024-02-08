package xx0110;

import java.util.Scanner;

public class xx07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 0; // 영수증 값
		int productCnt = 0; // 영수증에 구매한 물건 갯수
		int calcu_total = 0; // 직접 계산한 값
		
		total = sc.nextInt(); // 260000만원
		productCnt = sc.nextInt(); // 4
		
		// 배열만들기
		int[] itemPrice = new int[productCnt];
		int[] itemCnt = new int[productCnt];
		
		for(int i=0; i<productCnt; i++) {
			String temp = sc.nextLine();
			itemPrice[i] = Integer.parseInt(temp.split("")[0]);
			itemCnt[i] = Integer.parseInt(temp.split("")[1]);	}
		for(int i=0; i<productCnt; i++) 
			calcu_total = calcu_total + (itemPrice[i] * itemCnt[i]); 
	
		if(total == calcu_total)
			System.out.println("yes");
		else 
			System.out.println("no");
		
		System.out.println(calcu_total);
		for(int i=0; i<productCnt; i++) {
			System.out.println("itemPrice[i]"+itemPrice[i]);
			System.out.println("itemCnt[i]"+itemCnt[i]);
		}
	
		
		/*
		 * 260000 4 20000 5 30000 2 10000 6 5000 8
		 * 260000 4 20000 5 30000 2 10000 6 5000 8
		 * */
		
	}
	
}
