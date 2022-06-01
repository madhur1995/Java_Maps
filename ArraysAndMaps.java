package Strings;

import java.util.HashMap;
import java.util.Map;

public class ArraysAndMaps {

	public static void main(String[] args) {

		String arr[] = { "Aman", "mad", "yogi", "mad", "ms", "kp", "kd", "Mad" };

		Map<String, Integer> map = new HashMap<>();

		for (String i : arr) {
			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);

		}

		map.entrySet().forEach(i -> {
			System.out.println(i.getKey() + "   " + i.getValue());
		});

	}

}
