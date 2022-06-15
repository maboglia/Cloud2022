package funzionale;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class AlgoritmiNumeri {

	public static void main(String[] args) {

		IntSummaryStatistics summaryStatistics = 
				Arrays.stream(new int[] {2,4,6,8,10,12}).map(x -> x*3).summaryStatistics();

		
		System.out.println(summaryStatistics);
	}

}
