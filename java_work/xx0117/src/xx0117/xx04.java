package xx0117;

public class xx04 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		// c1.rad = 10;
		c1.setRad(10);
		//System.out.println(c1.rad);
		System.out.println(c1.getarea());
		
		Circle c2 = new Circle(20);
		System.out.println(c2.getarea());
		
		
		//c1.rad = 3;
		c1.setRad(-3);
	}
	
}
