package xx0112;

import java.util.Scanner;

public class xx13 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		StringBuilder result = new StringBuilder();
		
		for(char a : str.toCharArray()) {
			if(Character.isUpperCase(a)) {
				result.append(Character.toLowerCase(a));
			} else if(Character.isLowerCase(a)) {
					result.append(Character.toUpperCase(a));
			}else {
				result.append(a);
			
			}
			
		}	
			System.out.println(result.toString());	
			}
		
		
		
	}

		