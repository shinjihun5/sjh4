package ex03;

public class Ex09 {

	public static void main(String[] args) {
		double d = 85.4d;
		int score = (int) d;

		int aa = 55;
		double ee = aa;

		// 비트 체계가 작은거에서 큰걸로 바꿀때는 자료의 소실이 없음 자동 형변환
		System.out.println("ee = " + ee);
		// 실수는 d 인트인 정수로 형변환시키면 소수점 사라짐
		System.out.println("score " + score);
		System.out.println("d = " + d);

	}

}
