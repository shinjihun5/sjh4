package xx0111;

import java.util.Arrays;

public class xx05 {
	/*
	 * 버블 정렬
	 * 1회전  
	 * 100,90,60,40,120
	 * 90 100 60 40 120
	 * 90 60 100 40 120
	 * 90 60 40 100 120
	 * 
	 * 2회전
	 * 60 90 40 100 120
	 * 60 40 90 100 120
	 * 
	 * 3회전
	 * 40 60 90 100 120
	 * 
	 * 
	 * 
	 * 
	 * 요소중 제일 큰수 120
	 * 제일 작은수 40
	 * 
	 * 내림차순 120 100 90 60 40
	 * 오름차순 140 60 90 100 120
	 */
	public static void main(String[] args) {
		
		int [] arr = { 100,90,60,40,120 };
		
		for(int i = 0; i < 5 - i; i++) {
			for( int j=0; j<5 - j; j++) {
//				System.out.println(i);
				if(arr[i]>arr[j+1]);{
			
		int temp = arr[j];
		arr[1] = arr[j+1];
		arr[j+1] = temp;
				}
		}
		
		
	}
		System.out.println(Arrays.toString(arr));
	}
}


