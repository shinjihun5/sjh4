package ex03;

public class Ex05 {

	
	public static void main(String[] args) {
		char aa = 'A';
		char bb = 'B';
		int  vv = (aa + bb);
		char vV = 'C';
		System.out.println(aa + bb);
        System.out.println(vv);
		System.out.println((int)aa);
        char cc = (char) (aa + bb);
        // char cc = int cc char cc일때는 (char) int cc일때는 (aa + bb)
        
        System.out.println((int)cc);
	
	    byte kk = 127;
	    System.out.println(kk+1);
	    System.out.println((byte)(kk+1));
        
        
	}
}
