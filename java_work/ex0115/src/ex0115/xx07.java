package ex0115;

public class xx07 {
	
	
	public static int solution(int num,int n) {
		
		if(num % n == 0) {
			return 1;
		}else {
		
				return 0;
		}
		
	}
	
public static void main(String[] args) {
	
	int num = 34;
	int n = 3;
	int result = solution(num,n);
	System.out.println(result);
}
}
