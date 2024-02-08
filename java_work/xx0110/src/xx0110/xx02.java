package xx0110;

public class xx02 {
	
	// 랜덤한 숫자 3개를 꺼내서 같은 숫자가 나오면 트루 출력 아니면 false 출력
	// 1~46
	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// 0<x<1
		// 0<x 45
		for(int i=0; i<46; i++)
	
	//	System.out.println((int)Math.random()* 45);
		a = (int) (Math.random()*45) +1;
		b = (int) (Math.random()*45) +1;
		c = (int) (Math.random()*45) +1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a==b || a==c || b==c);
	}

}
