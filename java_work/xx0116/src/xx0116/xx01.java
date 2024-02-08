package xx0116;

public class xx01 {
	
	public static void main(String[] args) {
		
		person[] p = new person[10];
		p[0] = new person();
		p[0].name = "홍길동";
		
		p[0].setperson("이길동", "010-9946-2662", "남자", "....");
		
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
	}

}
