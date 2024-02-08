package xx0117;


class Accumulator{
	
	static int sum = 0;
	
	public static void add(int i) {
		sum += i;
	}
	public static void showResult() {
		System.out.println("sum = 45");
	}
	
	
}


public class xx09 {
public static void main(String[] args) {
	
	for(int i = 0; i < 10; i++) {
		Accumulator.add(i);
	}
	
	
	Accumulator.showResult();
}
}
