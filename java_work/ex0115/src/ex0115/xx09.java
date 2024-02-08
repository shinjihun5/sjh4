package ex0115;

//부등호가 <이고 등호가 =일 경우, n이 m보다 작거나 같으면 1을 반환합니다.
//등호가 >이고 등호가 =일 경우, n이 m보다 크거나 같으면 1을 반환합니다.
//부등호가 <이고 등호가 !일 경우, n이 m보다 작으면 1을 반환합니다.
//부등호가 >이고 등호가 !일 경우, n이 m보다 크면 1을 반환합니다.

public class xx09 {
	
	public static int solution(String ineq, String eq, int n, int m) {
		
		if(ineq.equals("<") && eq.equals("=")) {
			return(n == m) || (n <= m) ? 1 : 0;
		} else if(ineq.equals(">") && eq.equals("=")) {
			return(n == m) || (n >= m) ? 1 : 0;
		} else if(ineq.equals("<") && eq.equals("!")) {
			return(n == m) || (n <= m) ? 1 : 0;
		} else if(ineq.equals(">") && eq.equals("!")) {
			return(n == m) || (n >= m) ? 1 : 0;
	}
	return 0;
	}
	public static void main(String[] args) {
		
		String ineq = ">";
		String eq = "!";
		int n = 41;
		int m = 78;
		int result = solution(ineq,eq,n,m);
		System.out.println(result);
	}

}
