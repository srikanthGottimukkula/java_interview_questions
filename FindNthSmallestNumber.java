package interview_programs;

import java.util.Arrays;
import java.util.Comparator;

//Find N th smallest number
public class FindNthSmallestNumber {

	public static void main(String[] args) {
		int[] arrays = { 2, 9, 4, 1, 77, 22 };
		int n = 3;

//		Arrays.stream(arrays).skip(n - 1).findFirst().ifPresent(System.out::println);
		
		//reverse order nth element
		Arrays.stream(arrays).boxed().sorted(Comparator.reverseOrder()).skip(n - 1).findFirst()
				.ifPresent(System.out::println);
	}

}
