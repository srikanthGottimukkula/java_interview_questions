package interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//First Two numbers sum
public class FirstTwoNumbersMultiply {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 8, 2, 4, 9, 10);

		Optional<Integer> reduce = numbers.stream().limit(2).reduce((a, b) -> a * b);
		reduce.ifPresent(System.out::println);
	}

}
