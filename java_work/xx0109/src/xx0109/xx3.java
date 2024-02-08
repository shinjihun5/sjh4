package xx0109;

public class xx3 {
	
	public  static void doA() {
	System.out.println("doA 매게변수 없는 함수");
		 // 함수 종료
	return;
	}
	public  static void doB(int a) {
	
	System.out.println("doA 매게변수 a= "+a);	
	if(a==10) {
		return;
	}
	else if(a==8) {
		System.out.println("종료됩니다.");
	
	}
	System.out.println("if구문 else 구문 못갔다");
	
	}
	 public  static int doC(int a) {
		return a*a;
	 }
	
	 public static void doD() {
		 
		// System.out.println("abcdef".substring(3));
		//  System.out.println("abcdef".substring(3,5));
	 }
	 // 단축기 alt + 화살표 
	 
	public static void main(String[] args) {
		// doA();
		// doB(7);
		// int a = doC(10);
		// System.out.println(a);
		// doD();
		System.out.println("abcdef".substring(3));
		 System.out.println("abcdef".substring(3,5));
	
	}
	
	
}
