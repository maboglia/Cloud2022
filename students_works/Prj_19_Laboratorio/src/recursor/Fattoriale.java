package recursor;

public class Fattoriale {
	
	public static void main(String[] args) {
	
		int x = 5;
		
		int i = fattoriale(x);
		
		System.out.printf("Il fattoriale di %d è: %d",x,i);
	}

	private static int fattoriale(int x) {
		
		if(x == 0)
			return 1;
		else {
			System.out.println("valore di x = " + x);
			return x*fattoriale(x-1);
			
		}
	}
}
