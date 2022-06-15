package funzionale;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamString {

	public static void main(String[] args) {

		String[] note = {"do", "re", "mi", "fa", "sol", "la", "si"};
		Object[] noteOrdinate = Stream.of(note)
			.sorted()
			.toArray();
		
		
		for (String nota : note) {
			System.out.println(nota);
		}
		System.out.println("-------------------------------");

		for (Object object : noteOrdinate) {
			System.out.println(object);
		}
		System.out.println("-------------------------------");
		
		List<String> noteLista = Arrays.asList(note);
		noteLista.stream().sorted((n1, n2) -> n2.compareTo(n1)).forEach(System.out::print);;
		
	}

}
