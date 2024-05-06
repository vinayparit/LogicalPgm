package Interview;

import java.util.ArrayList;

public class BalancedString {
	public static void main(String[] args) {
		String s = "{[()]})";
		ArrayList<Character> a = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			if ((a.size() != 0) && ((s.charAt(i) == '}' && a.get(a.size() - 1) == '{')
					|| (s.charAt(i) == ')' && a.get(a.size() - 1) == '(')
					|| (s.charAt(i) == ']' && a.get(a.size() - 1) == '['))) {
				a.remove(a.size() - 1);
			} else {
				a.add(s.charAt(i));
			}
		}
		if (a.size() == 0) {
			System.out.println("Given String is Balanced");
		} else {
			System.out.println("Given String is Not Balanced");
		}
	}
}
