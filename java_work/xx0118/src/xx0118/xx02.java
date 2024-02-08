package xx0118;

class AA{
	
	public static void doprint() {
		System.out.println("스태틱 doprint");
		System.out.println("Fwefew");
	}
	
}


class AAA{
	public static AA aa = new AA();
	public void doA() {
		System.out.println("AAA doA");
	}

}



public class xx02 {
public static void main(String[] args) {
	
	AAA aa = new AAA();
	aa.doA();
	
	AAA.aa.doprint();
	
	System.out.println("테스트");
	
	

}
	
}
