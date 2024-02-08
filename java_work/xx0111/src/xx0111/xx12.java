package xx0111;

public class xx12 {
	
	public static void main(String[] args) {
		
		int a = 89;
		int b = 8;
		int result = solution(a,b);
		System.out.println(result);
	
	}
	

	public static int solution(int a, int b) {
		String ab = Integer.toString(a)+Integer.toString(b);
		String ba = Integer.toString(b)+Integer.toString(a);
		
		int intAB = Integer.parseInt(ab);
		int intBA = Integer.parseInt(ba);
		
		return Math.max(intAB, intBA);
		
	}
	
	
}
