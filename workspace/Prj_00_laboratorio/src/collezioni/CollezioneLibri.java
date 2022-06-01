package collezioni;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollezioneLibri {

	public static void main(String[] args) {


		List<Libro> libri = Arrays.asList(
				new Libro(1, "I promessi", 10),
				new Libro(2, "Zanna bianca", 8),
				new Libro(3, "Mille e una notte", 12),
				new Libro(4, "Aladino", 11),
				new Libro(5, "Torino oggi", 5)
				);
		
		
		
		//Collections.sort(libri, comp);
		
		libri.stream().sorted((l1, l2) -> l1.getId() - l2.getId() ).forEach(l -> System.out.println(l));
		System.out.println("-----------------------------");
		libri.stream().sorted((l1, l2) -> l2.getTitolo().compareTo(l1.getTitolo())).forEach(l -> System.out.println(l));
		
		System.out.println("-----------------------------");
	
		libri.forEach(l -> System.out.println(l));
	
	}

}
