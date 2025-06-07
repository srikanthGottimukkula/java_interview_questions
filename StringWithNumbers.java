package interview_programs;

import java.util.Arrays;
import java.util.List;

//Find out the list of Strings with numbers 
public class StringWithNumbers {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("1apple", "mango", "2banana", "9pineapple");

		list.stream().filter(str -> !str.isEmpty() && Character.isDigit(str.charAt(0))).forEach(System.out::println);
	}

}
