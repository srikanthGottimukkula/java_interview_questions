package interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find Even and Odd Numbers
public class FindEvenOddNumList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 6, 4, 9, 7);

		List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("EvenNumbers ::" + evenNumbers);
		List<Integer> oddNumbers = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println("odd numbers ::" + oddNumbers);

	}

}
