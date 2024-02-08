package xx0111;

public class xx03 {
	
	public static int solution(int[] num_list) {
		int answer = 0;
		int result = num_list[0];
		int result2 = num_list[0];
		// i는 0부터 배열의 길이만큼
		for (int i = 1; i < num_list.length; i++) {
			result = result * num_list[i];
			result2 += num_list[i];
		}
		System.out.println(result);
		System.out.println(result2);
		
		if ( result > result2)
			answer = 0;
		else
			answer = 1;
		
		return answer;

		
	}

	public static void main(String[] args) {
		
		//int[] num_list = {3,4,5,2,1};
		  int[] num_list = {5,7,8,3};
		
		  solution(num_list);
		  
		System.out.println(3 * 4 * 5 * 2 * 1);
		System.out.println((3 + 4 + 5 + 2 + 1) * (3 + 4 + 5 + 2 + 1));
	}
	
}
