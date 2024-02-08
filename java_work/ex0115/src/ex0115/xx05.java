package ex0115;

public class xx05 {
	
	public static int solution(int a, int b) {
		
		String str1 = Integer.toString(b)+Integer.toString(a);
		String str2 = Integer.toString(a)+Integer.toString(b);
		
		
		int ab = Integer.parseInt(str2);
		int ba = Integer.parseInt(str1);	
			
		return Math.max(ab, ba);
		
		
		}
		
		
	
	
	public static void main(String[] args) {
		
		int a = 89;
		int b = 8;
		int result = solution(a,b);
		System.out.println(result);
		
	}

}
