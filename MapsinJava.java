package Strings;

import java.util.HashMap;
import java.util.Map;

public class MapsinJava {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(100, "whwwh");
		// Elements can traverse in any order
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

	}
}
