package xx0117;

class CapA{
	public void take() {
		System.out.println("CapA 약묵음 1");
	}
}
class CapB{
	public void take() {
		System.out.println("CapA 약묵음 2");
}
class CapC{
	public void take() {
		System.out.println("CapA 약묵음 3");
		}
	}
class coldPatient{
	void takeA(CapA a) {
		a.take();
	}void takeB(CapA b) {
		b.take();
	}void takeC(CapA c) {
		c.take();
	} void takeAll(CapA a, CapB b, CapC c) {
		a.take(); b.take(); c.take();	}
}
public class Class {
public static void main(String[] args) {
	coldPatient cp = new coldPatient();
	//cp.takeC(new CapC());
	//cp.takeB(new CapB());
	//cp.takeA(new CapA());
	cp.takeAll(, null, null);
}
}
}
