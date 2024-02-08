package ex0115;

import java.util.Arrays;

public class xx02 {

	public static String solution(String[] arr) {
		StringBuilder result = new StringBuilder();
		
		for(String str : arr) {
			result.append(str);
			
		}
		return result.toString();

		
	
	}
	
	
	
	public static void main(String[] args) {
		
		String[] arr = {"a","b","c"};
		String result = solution(arr);
		System.out.println(result);
		
	
	
	}
	
}
