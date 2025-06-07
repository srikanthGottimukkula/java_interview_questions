package interview_programs;

public class StringVsStringBuffer {

	public static void main(String[] args) {

		// String :- immuatable or can't change
		String s = new String("Hello");
		s.concat("Srikanth");
		System.out.println(s);

		
		//StringBuffer :- mutable we can chnage !!
		StringBuffer sb = new StringBuffer("Good Night");
		sb.append(" Bye!!");
		System.out.println(sb);

	}

}
