package xx0109;

public class Ex03 {
	/*
	 * [1, 2, 3, 3, 3, 4] 3 [1, 1, 2, 2] -1 [1] 1
	 */
	public static int solution(int[] array) {
		int[] realArr = new int[array.length];
		int[] cntArr = new int[array.length];

		int rcnt = 0;
		for (int i = 0; i < realArr.length; i++) {
			int count=0;
			for (int j = 0 ; j < realArr.length; j++) {
				if (array[i] == realArr[j]) {
					System.out.println("i 가 넘어가야함...");
					count++;
				}
			
			}
			if(count ==0) {
				realArr[rcnt++] = array[i];
			}
		}
	
		rcnt=0;
		for (int i = 0; i < realArr.length; i++) {
			int count = 0;
			for (int j = 0 ; j < realArr.length; j++) {
				if(realArr[i]==array[j])
				{
					count++;
				
				}
			}
			cntArr[rcnt++] = count-1;
		}
		int max = cntArr[0];
				
		for (int i =1 ; i<cntArr.length;i++) {
			if(max <cntArr[i])
				max = cntArr[i];
		}
		System.out.println("최빈값은 = "+max +"입니다");
		
		for(int i =0; i<cntArr.length;i++) {
//			System.out.println(cntArr[i]);
		if(cntArr[0]==cntArr[i])
			max = -1;
		}
	
		}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 3, 3, 4 };
		int arr2[] = { 1, 1, 2, 2 };
		int arr3[] = { 1 };

		int result = solution(arr1);
		System.out.println("result = " + result);
//		solution(arr2);
//		solution(arr3);
	}
}
