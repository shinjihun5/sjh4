package xx0108;

import java.util.Scanner;

public class xx1 {

	public static int solution(int a, int b) {
       
		int result1 = Integer.parseInt(a+""+b);
		int result2 = Integer.parseInt(b+""+a);
        
         if(result1<result2)
 			return result2;
 		else
 			return result1;
	}
        	
        // string > int integer.parseInt(변수명)
        // string > float
        // float.perseFloat
        
        
        
		

	
	public static void main(String[] args) {	
	
	Scanner sc = new Scanner(System.in);
	
	int a = 412;
	int b = 3;
	
	int result = solution(a,b);
	System.out.println(result);
		
		
		
		
	}

}
