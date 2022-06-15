package funzionale;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamInteri {

	public static void main(String[] args) {

//		IntStream.of(22,24,26,28,30)
		IntStream.range(1, 101)
			.skip(30)
			.filter(i -> i > 10)//predicate
			.filter(i -> i % 2 == 0)//predicate
			.filter(i -> i % 3 == 0)//predicate
			.forEach(n -> System.out.println(n));//consumer
		
		int[] array = IntStream.of(22,24,26,28,30)
				.filter(i -> i > 25)//predicate
				.filter(i -> i < 30)//predicate
				.toArray();
		
		System.out.println(array.length);
	}

}
