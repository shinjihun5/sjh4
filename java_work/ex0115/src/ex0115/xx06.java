package ex0115;

public class xx06 {
	
	public static int solution(int a, int b) {
		
		String str1 = Integer.toString(a)+Integer.toString(b);
		int ab = Integer.parseInt(str1);
		int ba = 2*a*b;
		
		
	//	if(ab==ba) {
		//	System.out.println(ab);
		
		return Math.max(ab, ba);
	}
	
	public static void main(String[] args) {
		
		int a = 91;
		int b = 2;
		int result = solution(a,b);
		System.out.println(result);
		
		
	}

}
