package interfacce;

public class Implementazione implements Contratto, Contratto2, Vuota {

	@Override
	public void esegui() {
		System.out.println(NOME_AZIENDA);
		
	}

	@Override
	public void esegui2() {
		System.out.println(NOME_AZIENDA);
		
	}

	@Override
	public void esegui3() {
		System.out.println(NOME_AZIENDA);
		
	}

	@Override
	public void metodoBase() {
		System.out.println(NOME_AZIENDA);
		
	}


}
