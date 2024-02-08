package xx0117;

public class xx08 {

	public static int solution(int n, String control) {
		for(char cnt : control.toCharArray()) {
			switch (cnt) {
			case 'w':
				n += 1;
				break;
			case 's':
				n -= 1;
				break;
			case 'd':
				n += 10;
				break;
			case 'a':
				n -= 10;
				break;
			
			default:
				break;
			}
		}
		return n;
		}
	
	
	public static void main(String[] args) {
		int n = 0;
		String control = "wsdawsdassw";
		int result = solution(n, control);
		System.out.println(result);
		
		
	}
	
}


// for(int i = 0; i < control.leght; i++){
// char cnt = control.charAt(i);