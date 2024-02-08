package xx0116;

/*문자열 code가 주어집니다.
code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다.
mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서
code[idx]의 값에 따라 다음과 같이 행동합니다.
*/
public class xx05 {
	
	public static String solution(String code) {
		
		int mode = 0;
		StringBuilder ret = new StringBuilder();
		
		for(int idx = 0; idx < code.length(); idx++) {
			char afs = code.charAt(idx);
			
			if(afs == '1') {
				mode = 1 - mode;
			}else {
				if(mode == 0) {
					ret.append(afs);
				}
				}
			if (mode == 1) {
	            ret.append('1');
		}
		}
		return ret.toString();
	}

	public static void main(String[] args) {
		String code = "abc1abc1abc";
		String result = solution(code); 
		System.out.println(result);
	}
	
	

}
