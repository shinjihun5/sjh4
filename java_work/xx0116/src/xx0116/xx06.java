package xx0116;

public class xx06 {
	
	public static void main(String[] args) {
		Data d1 = new Data();
		System.out.println(d1.toString());
		System.out.println(d1);
	
		Data d2 = copy(d1);
		System.out.println(d2);
		
		d2.x = 100;
		System.out.println(d1);
	}
		Static Data copy(Data d) {
			Data data = new Date();
		
		
		}

}
class Data{
	int x =10;



@Override
public String toString() {
	return "Data [x=" + x + "]";
}
}
