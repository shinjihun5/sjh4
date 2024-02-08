package xx0116;

public class Bankaccount {

	int 돈 = 0;
	
	public void 입금하기(int 얼마) {
		돈 += 얼마;
	}
	public void 출금하기(int 얼마) {
		돈 -= 얼마;
		
	}
	public void 확인하기() {
		System.out.println(돈);
	}

			
	}

