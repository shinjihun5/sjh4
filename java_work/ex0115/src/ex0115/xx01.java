package ex0115;

public class xx01 {
	
	public static String solution(String str1, String str2) {
		StringBuilder result = new StringBuilder();
		
		int maxLength = Math.max(str1.length(), str2.length());
		
		for(int i = 0; i < maxLength; i++) {
			if(i < str1.length()) {
			}	result.append(str1.charAt(i));
				if( i < str2.length()) {
					result.append(str2.charAt(i));
				}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		String result = solution(str1,str2);
		System.out.println(result);
	}

}
