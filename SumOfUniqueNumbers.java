package interview_programs;

import java.util.Arrays;
import java.util.List;

//Find sum of Unique numbers
public class SumOfUniqueNumbers {

	public static void main(String[] args) {
		List<Integer> duplicateNum = Arrays.asList(1, 5, 8, 3, 1, 6, 3, 2, 1);

		int sumOfUniqueNum = duplicateNum.stream().distinct().mapToInt(Integer::intValue).sum();

		System.out.println("Sum of Unique numbers :: " + sumOfUniqueNum);

	}

}
