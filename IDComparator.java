package interview_programs;

import java.util.Comparator;

public class IDComparator implements Comparator<Employee> {

//	@Override
//	public int compare(Employee e1, Employee e2) {
//		if (e1.getId() == e2.getId()) {
//			return 0;
//		} else if (e1.getId() > e2.getId()) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}
	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getId() == e2.getId()) {
			return e1.getName().compareTo(e2.getName());
		} else if (e1.getId() > e2.getId()) {
			return 1;
		} else {
			return -1;
		}
	}

}
