package xx0115;

public class xx02 {

	// 기본 생성자
	// static 변수 static 점수
	
	xx02(){
			System.out.println("기본 생성자");
	
}

public static void doA() {
	System.out.println("static점수");
}
public void doB() {
	System.out.println("non-static점수");
}
public static void main(String[] args) {

	/*
	 * doB(); xx02.doB();
	 */
	doA();
	xx02.doA();
	
	
	
	xx02 Xx02 = new xx02();
	xx02.doA();

}
}