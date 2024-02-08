package xx0110;

public class xx03 {
	
	public static void main(String[] args) {
		// i는 0일때 j 1~9 i가 9까지 출력될때까지 j도 반복
		for(int i =0; i<10; i++){ 
        {
			if(i%3==0)
				continue;
						System.out.println("i = "+i);
		
			for(int j=0; j<10; j++) {
					
				if(j==7) { 
				//	i = i+1;
					break;
			}
						System.out.println("\t j = "+j);
			}
			}
			}
	}
}
