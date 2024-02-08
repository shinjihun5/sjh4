package ex0115;

public class xx08 {
	
	public static int solution(int a) {
		
		int answer = 0;
		
		if(a % 2 == 1) {
			for(int i = 1; i <= a; i+=2) { 
				answer += i;
			}
		}	else {
			for(int i = 2; i <=a; i+=2) {
				answer += i*i;
		}
		}
			return answer;
	}
	

	public static void main(String[] args) {
		
		int a = 10;
		int sum = solution(a);
		System.out.println(sum);
	}

}
