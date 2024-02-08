package xx0109;

public class xx1 {
	/*문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
	 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
	 * 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
	 *
	 *예제 1번의 my_string에서 인덱스 2부터 overwrite_string의 길이만큼에 
	 *해당하는 부분은 "11oWor1"이고 이를 "lloWorl"로 바꾼 "HelloWorld"를 return 합니다.
	 *
*/	

	
	
	
	public static String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
	
		String temp = my_string.substring(0,s) + overwrite_string;
	String result = my_string.substring(0,s) + overwrite_string + my_string.substring.(temp.length()));
	//	System.out.println(my_string.length());
	//	System.out.println(temp.length());
	//	System.out.println();
		
	//	System.out.println(my_string.substring(0,s) + overwrite_string + my_string.substring(9));
	//	System.out.println(my_string.length());
		
	//	System.out.println(my_string.substring(2));		
	//	System.out.println(my_string.substring(5));
	//	System.out.println(my_string.substring(7));
		
	//	System.out.println(my_string);
	//	System.out.println(overwrite_string);
	//	System.out.println(s);
		
		// charAt()-몇번재꺼... toCharArray()-문자로 배열만들어라 
		// replace-대체해라 split-분할해라
		// subString - 몇번째부터 잘라라
		// length 길이를 구하는 함수
		// abcdef.subString
		
		// overwrite_string = lloWorl
		// s = 2
		return my_string.substring(0,s) + overwrite_string + my_string.substring(9);
		
	}
	
	public static void main(String[] args) {
	
		


		
		
	}

}
