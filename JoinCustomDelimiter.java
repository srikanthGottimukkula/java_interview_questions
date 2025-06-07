package interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinCustomDelimiter {

	public static void main(String[] args) {
		List<String> banks = Arrays.asList("sbi", "hdfc", "idid", "andra");

//		String collect = banks.stream().map(w -> "[" + w + "]").collect(Collectors.joining(","));
//		System.out.println(collect);

		String result = banks.stream().collect(Collectors.joining(",","[","]"));
		System.out.println(result);
	}

}
