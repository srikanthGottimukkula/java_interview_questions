package interview_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastMap {

	public static void main(String[] args) {

//		Map<Number, String> map = new HashMap<>();//fail fast
		Map<Number, String> map = new ConcurrentHashMap<>(); //fail Safe

		map.put(1, "Srikanth");
		map.put(2, "Raju");

		Iterator<Number> mapEx = map.keySet().iterator();

		while (mapEx.hasNext()) {
			Number value = mapEx.next();
			System.out.println(value + " " + map.get(value));
			map.put(5, "Kohli");
		}

	}

}
