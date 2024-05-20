package stringPgms;

public class a2b2c3 {

	public static void main(String[] args) {

		String s = "a2b4c1";
		 
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int num = s.charAt(i) - 48;
				for (int j = 0; j < num; j++) {
					System.out.print(s.charAt(i - 1));
				}
			}
		}
	}
}
