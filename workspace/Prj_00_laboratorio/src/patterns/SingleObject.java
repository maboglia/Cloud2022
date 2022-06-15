package patterns;

/**
 * Classe singleton crea e ritorna un'unica istanza dell'oggeto di tipo singleton
 * @author m.bogliaccino
 *
 */
public class SingleObject {
	
	private static SingleObject istanza = new SingleObject();
	
	private SingleObject() {
		System.out.println("oggetto singleton costruito");
	}
	
	
	public static SingleObject getIstanza() {
		return istanza;
	}
	
	public void salutami() {
		System.out.println("ehilà come va?");
	}
	
}
