package xx0109;

public class xx10 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		String a = "abcdef";
		System.out.println(a.length());

		for (int i = 0; i < arr.length; i++)
		System.out.println(arr[i]);
		System.out.println();
	
		for (int temp : arr) {
			System.out.println(temp);
		}
		System.out.println();

		String[] arr1 = {"aa","bb","cc","bb"};
		
		String sumstr = "";
		
		for(String temp :arr1) {
			System.out.println(temp);
		sumstr+= temp;
	}

	}
}
//문자열 배열