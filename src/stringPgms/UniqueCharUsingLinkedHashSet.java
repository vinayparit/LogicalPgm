package stringPgms;

import java.util.LinkedHashSet;

public class UniqueCharUsingLinkedHashSet {

	public static void main(String[] args) {

		String st = "Bangalore";
		String s = st.toLowerCase();

		LinkedHashSet<Character> hSet = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			hSet.add(s.charAt(i));
		}
		for (Character c : hSet) {
			System.out.println(c);
		}
	}
}
