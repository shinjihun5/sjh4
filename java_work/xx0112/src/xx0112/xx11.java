package xx0112;

public class xx11 {

	public static void main(String[] args) {
		int num = 55;
		int n = 10;
		int m = 5;
		int result = solution(num,n,m);
		System.out.println(result);
		
	}
	
	public static int solution(int num, int n, int m) {

		if(num % n == 0 && num % m == 0) {
			return 1;
	}	else {
			return 0;
			}
	
	}

	

}
