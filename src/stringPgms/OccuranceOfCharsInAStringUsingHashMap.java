package stringPgms;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class OccuranceOfCharsInAStringUsingHashMap {

	public static void main(String[] args) {

		String st = "Tester";
		String s = st.toLowerCase();

		LinkedHashMap<Character, Integer> hMap = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (hMap.containsKey(s.charAt(i))) {
				hMap.put(s.charAt(i), hMap.get(s.charAt(i)) + 1);
			} else {
				hMap.put(s.charAt(i), 1);
			}
		}
		for (Entry<Character, Integer> m : hMap.entrySet()) {
			if (m.getValue()>1) {
				System.out.println(m.getKey()+"  "+m.getValue());
			}
		}
	}
}
