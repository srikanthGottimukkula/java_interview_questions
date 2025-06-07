package interview_programs;

import java.util.Arrays;
import java.util.List;

//Find Number start with one
public class NumbersStratsWithOne {

	public static void main(String[] args) {
		List<Number> list = Arrays.asList(1, 21, 11, 10, 100, 17,32);

		//number start with one 
//		List<Number> oneStartNum = list.stream().filter(num -> String.valueOf(num).startsWith("1")).toList();
		
		//number not start with one
		List<Number> oneStartNum = list.stream().filter(num -> !String.valueOf(num).startsWith("1")).toList();
		
		System.out.println(oneStartNum);
	}

}
