package interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Second Largest Number
public class SecondLargesNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 9, 7, 4, 17, 10);
		Optional<Integer> secondLargest = numbers.stream().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst();
		System.out.println(secondLargest);
	}

}
