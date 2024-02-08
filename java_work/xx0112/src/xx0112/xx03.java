package xx0112;

public class xx03 {
public static void main(String[] args) {
		
		int num = 60;
		int n = 2;
		int m = 3;
		int result = solution(num,n,m);
		System.out.println(result);
	}
	public static int solution(int num, int n,int m) {
		
		if ( num % n == 0 && num % m == 0) {
			return 1;
		}else{
			return 0;
		}
	}
	
}

