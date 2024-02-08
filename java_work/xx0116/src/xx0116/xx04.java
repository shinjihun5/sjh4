package xx0116;

public class xx04 {

	public static int solution(int a, int b, boolean flag) {
		
		if(flag) {
			return a+b;
		}else {
				return a-b;
			
			}
			
		}
		
		
	
	
	
	public static void main(String[] args) {
		
		boolean flag = false;
		int a = -4;
		int b = 7;
		int result = solution(a,b,flag);
		System.out.println(result);
		
	}
	
}
