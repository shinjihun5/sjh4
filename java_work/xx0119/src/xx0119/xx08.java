package xx0119;

public class xx08 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 1000; i++) {
					System.out.println("t1 = "+i);
				}
			}
		
		});
	Thread t2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(int i = 0; i < 1000; i++) {
				System.out.println("t2 = "+i);
			}		
		}
	});

	t1.start();
	t2.start();
	
	}
	}


