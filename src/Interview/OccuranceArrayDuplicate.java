package Interview;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class OccuranceArrayDuplicate {

	public static void main(String[] args) {

		int[] s = { 10, 20, 10, 11, 1, 4, 15 };
		int c = 0;
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < s.length; i++) {
			if (map.containsKey(s[i])) {
				map.put(s[i], map.get(s[i]) + 1);
			} else {
				map.put(s[i], 1);
			}
		}
		for (Entry<Integer, Integer> itr : map.entrySet()) {
			if ((itr.getValue()) > 1) {
				System.out.println(itr.getKey() + " " + itr.getValue());
				c = 1;
			}
		}
		if (c == 0) {
			System.out.println("Given array is unique :" + -1);
		}

	}
}
