package xx0112;


public class xx14 {

		
	public static String solution(String my_string,	String overwrite_stirng, int n) {
			StringBuilder result = new StringBuilder(my_string);
			
			for(int i = n, j = 0; j < overwrite_stirng.length() && i < my_string.length(); i++, j++) {
			result.setCharAt(i, overwrite_stirng.charAt(j));
			}
			return result.toString();
			
	}

	
	public static void main(String[] args) {
	
		String my_string = "He1oWor1d";
		String overwrite_stirng = "lloWorl";
		int n = 2;
		
		String result = solution(my_string,overwrite_stirng,n);
		System.out.println(result);
		
	}

	

}

