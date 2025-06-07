package interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//How do you remove duplicate elements from a list using Java 8 streams?
public class DuplicateStrings {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "python", "Go", "net", "java", "c");

		List<String> uniqueWords = list.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueWords);

	}

}
