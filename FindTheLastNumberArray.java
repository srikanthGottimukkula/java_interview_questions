package interview_programs;

import java.util.Arrays;

//Find the last number of array
public class FindTheLastNumberArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 9, 6, 3, 8, 28 };

		Arrays.stream(numbers).skip(numbers.length - 1).findFirst().ifPresent(System.out::println);
	}

}
