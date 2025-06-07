package interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//How do you find frequency of each element in an array or a list?
public class FrequecyOfEachWord {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "python", "angular", "car", "apple", "pen", "java", "python");
		Map<String, Long> noOfWords = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("The given number of words is :: " + noOfWords);
	}

}
