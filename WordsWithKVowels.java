package interview_programs;

import java.util.Arrays;

public class WordsWithKVowels {

	public static void main(String[] args) {

		String word = "I am Srikanth From warangal orange!!";
		int k = 3;

		Arrays.stream(word.split(" ")).filter(c -> countVlaue(c) == k).forEach(System.out::println);

	}

	public static long countVlaue(String value) {
		return value.chars().mapToObj(ch -> (char) ch).filter(c -> "aeiouAEIOU".indexOf(c) != -1).count();
	}

}
