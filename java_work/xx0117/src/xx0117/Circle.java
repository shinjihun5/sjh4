package xx0117;

public class Circlepoint {
	
	private int rad;
	// int rad;
	final double pi = 3.14;
	
	public Circlepoint() {}
	public Circlepoint(int rad) {
		super();
		this.rad = rad;

	
	}
	
	public void setRad(int r) {
		if(r < 0) { this.rad = 0; return; }
		this.rad = r;
	}
	public double getarea() {
		return rad*rad*pi;
		
	}
}
