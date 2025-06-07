package interview_programs;

//reverse string
public class ReverseStringManual {

	public static String reverseStringManual(String input) {

		char[] charArray = input.toCharArray();
		int left = 0;
		int right = charArray.length - 1;

		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;

			left++;
			right--;
		}

		return new String(charArray);
	}

	public static void main(String[] args) {
		String input = "Hello World !!";
		String string = ReverseStringManual.reverseStringManual(input);
		System.out.println("Original String :: " + input);
		System.out.println("Reverse String :: " + string);

	}

}
