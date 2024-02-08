package xx0116;

class HyClass{
	
	public String toString() {
		return "HyClass";
	}
	
}

public class xx07 {
	
	static int doA() {
		return 10;
	}
	static HyClass doClass() {
		HyClass mc = new HyClass();
		
		return mc;
	}
	
	public static void main(String[] args) {
		HyClass mc = new HyClass();
		System.out.println(mc);
			
		
	}

}
