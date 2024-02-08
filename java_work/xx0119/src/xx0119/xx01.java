package xx0119;




public class xx01 {

	xx01(){
		System.out.println();
	}
	xx01 (int a, int b){
		System.out.println(a);
		System.out.println(b);
	}
	
	xx01 ( String str){
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		
		new xx01();
		new xx01(10,20);
		new xx01("Af");
		
	}

}
