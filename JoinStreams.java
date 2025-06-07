package interview_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//How to join the two streams
public class JoinStreams {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1,99,100,123);
		List<Integer> list2 = Arrays.asList(89,3,6,89);
		
		Stream<Integer> mergeStream = Stream.concat(list1.stream(), list2.stream());
		mergeStream.forEach(System.out::println);
		
	}

}
