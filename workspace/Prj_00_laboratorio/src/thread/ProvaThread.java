package thread;

public class ProvaThread {

	public static void main(String[] args) {
		
		MioThread mt1 = new MioThread();
		
		mt1.start();
		
		try {
			Thread.sleep(2500);
			System.out.println("Sono il main thread");
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Runnable r1 = () -> {
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("sono il thread r1");
			};

		new Thread(r1).start();
		
		Runnable r2 = () -> System.out.println("sono il runnable r2");

		new Thread(r2).start();
		
	}

}
