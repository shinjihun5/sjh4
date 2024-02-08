package xx0117;
//밑변과 높이를 저장할 수 있는 생성자
//밑변과 높이로 넓이를 구하는 메서드
class tri{
	int width;
	int height;
	public tri() {};
	public tri(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "tri [width=" + width + ", height=" + height + "]";
	}

	public double area() {
		return width*height * 0.5;
		
	}
	
}


