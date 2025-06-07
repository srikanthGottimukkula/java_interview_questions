package interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelExtractor {
	public static void main(String[] args) {
		String sentence = "Copilot is amazing"; // Example input

		// Split sentence into words and extract vowels from each
		List<String> vowelWords = Arrays.stream(sentence.split("\\s+")) // Split into words
				.map(word -> word.chars() // Convert each word into a stream of characters
						.mapToObj(c -> (char) c) // Convert ASCII to character
						.filter(c -> "AEIOUaeiou".indexOf(c) != -1) // Check if it's a vowel
						.map(String::valueOf) // Convert to string
						.collect(Collectors.joining(""))) // Join vowels together
				.collect(Collectors.toList()); // Collect results into a list

		System.out.println("Vowels of each word: " + vowelWords);
	}
}
