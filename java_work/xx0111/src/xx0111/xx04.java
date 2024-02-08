package xx0111;

import java.util.Arrays;

public class xx04 {

	
	public static void solution(int [] temp) {
		temp[0] = 100;
		System.out.println(Arrays.toString(temp));
	}

	public static void doA(int temp) {
		temp = 200;
		System.out.println(temp);
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a;
		
		solution(a);
		System.out.println(Arrays.toString(a));
	}
}

