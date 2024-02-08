package xx0111;


public class xx09 {
	
	
		
		
		public static void main(String[] args) {

			String str1 = "String";
			String str2 = "love";
			
			String result = multiplyStrings(str1,3)+ "\n" + multiplyStrings(str2,10);

			System.out.println(result);
			
		}
		public static String multiplyStrings(String str, int k) {
			StringBuilder result = new StringBuilder();
			
			for(int i=0; i<k; i++) {
				result.append(str);
			
			}
		return result.toString();
		}

}


		
		
		
	

	
	


