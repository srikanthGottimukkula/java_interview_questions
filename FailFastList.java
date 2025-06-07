package interview_programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {

	public static void main(String[] args) {

//		List<Number> num = new ArrayList<>();
		List<Number> num = new CopyOnWriteArrayList<>();
		num.add(1);
		num.add(2);

		Iterator<Number> itr = num.iterator();
		while (itr.hasNext()) {
			Number next = itr.next();
			System.out.println(next);
			num.add(3);
			// copy of clone existing list but not printing the added value why bez here two
			// iterations
		}

	}

}
