package interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//From the given list of integers, print the numbers which are multiples of 5?
public class MultiplyByFive {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 8, 35, 60, 99, 100);

		List<Integer> collect = list.stream().filter(n -> n % 5 == 0).collect(Collectors.toList());
		System.out.println(collect);

	}

}
