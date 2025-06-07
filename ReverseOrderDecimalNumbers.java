package interview_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Find reverse order
public class ReverseOrderDecimalNumbers {

	public static void main(String[] args) {
		List<Double> decimals = Arrays.asList(2.9, 8.7, 1.0, 0.5, 8.99);

//		decimals.stream().sorted().forEach(System.out::println); //by default ascending order
		decimals.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //by customize order
	}

}
