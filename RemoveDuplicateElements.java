package interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple", "banana", "mango", "pineapple", "apple", "mango");

		// simple way
//		fruits.stream().distinct().forEach(System.out::println);

		// another way
		fruits.stream().collect(Collectors.toSet()).forEach(System.out::println);

	}

}
