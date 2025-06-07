package interview_programs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// How do you find frequency of each character in a string using Java 8 streams?
public class FrequencyOfCharacter {

	public static void main(String[] args) {
//		List<String> asList = Arrays.asList("Hello i am srikanth!!");

		String word = "Hello Worls I am srikanth!!";

		Map<Character, Long> freqCharacter = word.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(freqCharacter);
	}

}
