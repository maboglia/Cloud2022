package thread;

public class MioThread extends Thread {


	@Override
	public void run() {
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("sono il thread custom");
			System.out.println("esecuzione n. " + i);

			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		}
		
		
		
	
	
	}

	
	
}
