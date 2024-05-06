package Interview;

import java.util.LinkedHashMap;

import java.util.Map.Entry;

public class LargestDuplicateElementInArray {

	public static void main(String[] args) {

		int[] a = { 3, 1, 4, 2, 1, 4, 1 };
		int count = 0;
		int max = 0;
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);

			} else {
				map.put(a[i], 1);
			}
		}
		for (Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > 1) {
				if (e.getKey() > max) {
					max = e.getKey();
					count = e.getValue();
				}
			}
		}
		System.out.println(max + " " + count);
	}
}
