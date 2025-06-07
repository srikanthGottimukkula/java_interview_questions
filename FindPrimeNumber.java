package interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Find out the Prime number of given Array tricky
public class FindPrimeNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 5, 7, 90, 65);

		list.stream().filter(n -> isPrime(n)).forEach(System.out::println);
	}

	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		return IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(i -> num % i == 0);
	}

}
