package xx0118;

class instclass{
	static int num = 0;
		instclass(){
			num++;
			System.out.println("생성자 호출 "+num);
		}
	
}



public class xx01 {
	
	public static void main(String[] args) {
	
		
		new instclass();
	new instclass();
	new instclass();
}
}
