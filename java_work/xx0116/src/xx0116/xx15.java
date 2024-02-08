package xx0116;

public class xx15 {
	
	public static void main(String[] args) {
		
		// h1Everyone("홍길동",12,"남자");
		
		person p1 = new person();
		p1.initValue("이길동", "여자", 20);
		/*
		 * p1.name = "이길동"; p1.age = 20; p1.gender = "여자"; h1Everyone(p1);
		 */
	}
	
	static void h1Everyone(person p) {
		System.out.println("안녕하세요 저는 "+p.name+" 입니다");
		System.out.println("저는 "+p.age+"세 입니다");
		System.out.println("성별은 "+p.gender+" 입니다");
	}
	static void h1Everyone(String name, int age, String gender) {
		System.out.println("안녕하세요");
		System.out.println("저는 "+age+"세 입니다");
		System.out.println("성별은 "+gender+" 입니다");
	}
}
