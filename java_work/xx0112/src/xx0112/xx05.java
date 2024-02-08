package xx0112;

public class xx05 {
	

	    public static int solution(int n) {
	        int result = 0;

	        if (n % 2 == 1) {
	            // n이 홀수인 경우
	            for (int i = 1; i <= n; i += 2) {
	                result += i;
	            }
	        } else {
	            // n이 짝수인 경우
	            for (int i = 2; i <= n; i += 2) {
	                result += i * i;
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        // 테스트
	        System.out.println(solution(7));  // 홀수인 경우: 1 + 3 + 5 + 7 = 16
	        System.out.println(solution(10));  // 짝수인 경우: 2^2 + 4^2 + 6^2 = 56
	    }
	}


