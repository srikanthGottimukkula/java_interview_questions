package interview_programs;

import java.util.Arrays;
import java.util.stream.IntStream;

//How do you merge two unsorted arrays into single sorted array without duplicates?
public class MergingTwoArraysIntoStream {

	public static void main(String[] args) {
		int[] a = new int[] { 4, 2, 5, 1 };

		int[] b = new int[] { 8, 1, 9, 5 };

		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();

		System.out.println(Arrays.toString(c));
	}

}
