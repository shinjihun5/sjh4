package xx0108;

import java.util.Scanner;

public class xx7 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.println("현재 시간 입력");
	int h = sc.nextInt();
	int m = sc.nextInt();
	System.out.println("현재 시간 = "+h +" 분 "+m + "분");
	System.out.println("걸리는 시간 입력");
	int M = sc.nextInt();
	
	m = m + M;
	
	if (m >= 60) {
		h = h+ m/60;
		m = m % 60;
		
		}
	System.out.println("요리끝난 시간 ="+ h+" 시 "+ m+" 분 ");



}
	
}