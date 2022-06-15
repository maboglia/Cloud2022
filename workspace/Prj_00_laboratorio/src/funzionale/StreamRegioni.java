package funzionale;

import java.util.List;

public class StreamRegioni {

	public static void main(String[] args) {

		Regione piemonte = new Regione("piemonte", List.of("torino", "cuneo", "asti"), 4000000);
		Regione lombardia = new Regione("lombardia", List.of("milano", "como", "lecco"), 9000000);
		Regione lazio = new Regione("lazio", List.of("roma", "latina", "viterbo"), 5000000);
		
		List<Regione> regioni = List.of(piemonte, lombardia, lazio);
		
		List<Integer> list = regioni.stream().map(r -> r.popolazione).toList();
		
		Integer reduce = list.stream().reduce(0, (x, y) -> x+y);
		
		System.out.println(reduce);
	
	}

}
