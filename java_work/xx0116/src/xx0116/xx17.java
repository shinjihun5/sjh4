package xx0116;

public class xx17 {

	public static int solution(int[] num_list) {
		StringBuilder result = new StringBuilder();
		StringBuilder result2 = new StringBuilder();
		
		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i] % 2 == 0) {
				result.append(num_list[i]);
			} else {
				result2.append(num_list[i]);
			}
		}
		
				
		int a = (result.length() > 0) ? Integer.parseInt(result.toString()) : 0;		
		int b = (result2.length() > 0) ? Integer.parseInt(result2.toString()) : 0;
		
		return a + b;
}
	
	public static void main(String[] args) {
		int[] num_list = {3, 4, 5, 2, 1};
		int result = solution(num_list);
		System.out.println(result);
		
	}
}
