package ex0115;

class Data{
	int x = 10;
	int y = 20;
	
	void chagePri(int x){
	x = 200;
	}
void chageRef(Data d1) {
d1.x = 200;
}
}

public class xx04 {

	xx04(){
		Data d1 = new Data()
	public static void main(String[] args) {
		;
		d1.x = 100;
		System.out.println(d1.x);
		
		d1.chagePri(d1.x);
		System.out.println(d1.x);
	
		d1.chageRef(d1);
		System.out.println(d1.x);
			
	new xx04();	
		
	}

	
}

