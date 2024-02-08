package xx0112;

public class xx09 {
	
	public static String solution(String my_string, int k) {
		return my_string.repeat(k);
		}
	
	public static void main(String[] args) {
		
		xx09 solution = new xx09();
		
		String stringresult = solution.solution("string",3);
		String loveresult = solution.solution("love",10);
		System.out.println(stringresult);
		System.out.println(loveresult);
	}
}
