package xx0117;

public class xx02 {

	public static void main(String[] args) {
		tri t1 = new tri(10,20);
		tri t2 = new tri();

		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println(t1.area());
		System.out.println(t2.area());
		
	}
}