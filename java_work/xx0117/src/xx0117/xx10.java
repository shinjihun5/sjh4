package xx0117;

class point{
	int xpos,ypos;
	
	public point(int xpos, int ypos) {
		this.xpos = xpos;
		this.ypos = ypos;
	}

public void showpointinfo() {
	System.out.println(" [xpos = "+xpos+"] [ypos = "+ypos+"]");
}
}
class Circle{
	point p;
	int rad;
}
public void showCircleinfo() {
	Circle(point p, int rad){
		this.p = p;
		this.rad = rad;
		System.out.println(" [p = "+p+"] [rad = "+rad+"]");
	}
}

public class xx10 {
public static void main(String[] args) {
	
	point p1 = new point(5,10);
//	p1.showpointinfo();
	Circle c = new Circle(p1, 5);
	c.showCircleinfo();



}