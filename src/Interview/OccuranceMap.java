package Interview;

import java.util.*;


public class OccuranceMap {

	public static void main(String[] args) {

		String s = "tester";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		System.out.println(map);

	}
}
