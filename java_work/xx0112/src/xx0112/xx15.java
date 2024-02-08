package xx0112;

public class xx15 {

public static int solution(int[] number, int n) {

		int sum = 0;
		int index = 0;
	  while (index < number.length && sum + number[index] <= n) {
          sum += number[index];
          index++;
      }

      // 합이 정확히 n을 초과하는 경우 나머지 원소를 더함
      if (index < number.length && sum + number[index] > n) {
          sum += number[index];
      }

	
	return sum;
	}
	
	public static void main(String[] args) {
		
		int[] number = {58, 44, 27, 10, 100};
		int n = 139;
		
		int result = solution(number, n);
		System.out.println(result);
	}
	

	
		
		
	
	
	
	
}
