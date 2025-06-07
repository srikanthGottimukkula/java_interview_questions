package interview_programs;

import java.util.Arrays;
import java.util.List;

//First Two numbers sum
public class FirstTwoNumbersSum {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 8, 2, 4, 9, 10);

		int sum = numbers.stream().limit(2).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

}
