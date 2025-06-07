package interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//merge two streams and sorted order
public class MergesTwoStreamsAndSorted {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 99, 10, 4, 2);
		List<Integer> list2 = Arrays.asList(99, 80, 76);

		List<Integer> sortedMergeNum = Stream.concat(list1.stream(), list2.stream()).sorted()
				.collect(Collectors.toList());
		sortedMergeNum.forEach(System.out::println);
	}

	/*
	 * public static boolean isPrime(int num) { if (num <= 1) return false;
	 * 
	 * for (int i = 2; i < Math.sqrt(num); i++) { if (num % 1 == 0) { return false;
	 * } } return true; }
	 */

}
