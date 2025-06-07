package interview_programs;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find maximum and minimum of those numbers?
public class MinAndMaxNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 99, 88, 0, 1, 45, 78);
		Integer max = list.stream().max(Integer::compareTo).get();
		Integer min = list.stream().min(Integer::compareTo).get();
		System.out.println("Max Numbers :: " + max);
		System.out.println("Min Numbers :: " + min);
	}

}
