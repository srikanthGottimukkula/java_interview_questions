package interview_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeMainTest {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();

		Employee e = new Employee(100, "srikanth");
		Employee e1 = new Employee(80, "raju");
		Employee e2 = new Employee(76, "zebra");
		Employee e3 = new Employee(150, "venky");
		Employee e4 = new Employee(90, "ramu");
		Employee e5 = new Employee(90, "monkey");

		List<Employee> list = Arrays.asList(e, e1, e2, e3, e4,e5);
//		emp.add(e);
//		emp.add(e1);
//		emp.add(e2);
//		emp.add(e3);
//		emp.add(e4);

//		Collections.sort(list);
//		System.out.println(list);
		
		//comparator implementation
		Collections.sort(list, new IDComparator());
		System.out.println(list);
		

	}

}
