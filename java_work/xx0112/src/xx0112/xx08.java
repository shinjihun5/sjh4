package xx0112;

public class xx08 {
	
	

	public static int solution(int a, int b, boolean flag) {
		
		if(flag) {
			return a+b;
		} else {
			return a-b;
		}
	
	}
public static void main(String[] args) {
		
		int a = -4;
		int b = 7;
		boolean flag = true;
		int result =  solution(a, b, flag);
		System.out.println(result);
	}
	
}
