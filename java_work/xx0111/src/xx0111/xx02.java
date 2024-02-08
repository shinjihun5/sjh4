package xx0111;

public class xx02 {
	
	public static int solution(int a, int b, int c) {
	
		
		int answer = 0;
		
		if(a==b && a==c) {
			System.out.println("3개가 같음");
			answer = (a + b + c)*(a * a + b * b + c * c)*(a * a * a + b * b * b + c * c *c);
		}
		 else if (a==b || a==c || b==c)	{
			answer = (a + b + c)*(a * a + b * b + c * c);
		}
		 else { 
			 answer = a + b + c;
	}
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		int result = solution(4, 4, 4);
		System.out.println(result);

	
	
	}
	
}
