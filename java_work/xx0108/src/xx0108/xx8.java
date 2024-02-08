package xx0108;

import java.util.Scanner;

class xx8 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("주사윗 값 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b && a==c && a==c) 
			System.out.print(10000+(a*1000));
		if(a==b && (b!=c || a!=c))
			System.out.print(1000+(a*100));
		else if(b==c && (a!=c || b!=a))
			System.out.print(1000+(b*100));
		else if(a==c && (b!=a || b!=c))
			System.out.print(1000+(a*100));
		if(a!=b && a!=c && b!=c) {
		if(a>b && a>c && b!=c)
			System.out.println(a*100);
		else if(b>a && b>c && a!=c)	
			System.out.println(b*100);
		else if(c>a && c>b && b!=a)	
			System.out.println(c*100);
		}
		}
}

		
		
		
		
	


