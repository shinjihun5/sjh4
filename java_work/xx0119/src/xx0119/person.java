package xx0119;

public class person {

	private int regNum;
	private int passNum;
	
	public person(int regNum) {
		System.out.println("생");
		this.regNum = regNum;
	}

	public person(int regNum, int passNum) {
		this(regNum);
		System.out.println("생");
		
//		this.regNum = regNum;
		this.passNum = passNum;
	}


	public String toString() {
		return "person {regNum=" + regNum + ", passNum=" + passNum + "}";
		
	}
	
}
