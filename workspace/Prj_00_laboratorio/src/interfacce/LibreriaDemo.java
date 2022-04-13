package interfacce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//class MioComparatore implements Comparator<Libro>{
//
//	@Override
//	public int compare(Libro o1, Libro o2) {//se > di 0 
//		// TODO Auto-generated method stub
//		return o2.getPagine() - o1.getPagine();
//	}
//	
//}


public class LibreriaDemo {

	public static void main(String[] args) {
		
		List<Libro> libri = new ArrayList<>();
		libri.add(new Libro(1, "Io, robot", 10, 100));
		libri.add(new Libro(2, "Amazzonia", 15, 70));
		libri.add(new Libro(3, "Zanna Bianca", 8, 200));
		libri.add(new Libro(4, "Nonna Pina", 2, 500));
		libri.add(new Libro(5, "Cerco l'estate", 16, 80));

		//MioComparatore mc = new MioComparatore();
		
		//Comparator<Libro> mc = (o1, o2) -> o1.getPagine() - o2.getPagine();
		
		
		
		
		//Collections.sort(libri, (o1, o2) -> o2.getPagine() - o1.getPagine());
		
		
		List<Libro> economici =  libri
			.stream()
			.sorted((o1, o2) -> o2.getPagine() - o1.getPagine())
			.filter(l -> l.getPrezzo()<10)
//			.filter(l -> l.getPagine()<100)
//			.forEach(l -> System.out.println(l));
			.collect(Collectors.toList());
		
//		economici.forEach(System.out::println);
		economici.forEach(l -> System.out.println(l));
		
	}

}
