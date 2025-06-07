package interview_programs;

import java.util.stream.IntStream;

//Find out the given string polindrome or not ?
public class StringPolindrome {

	public static void main(String[] args) {

		String input = "DAD";

		boolean isPolindrome = IntStream.range(0, input.length() / 2)
				.allMatch(i -> input.charAt(i) == input.charAt(input.length() - 1 - i));
		System.out.println("isPolindrome :: " + isPolindrome);
	}

}
