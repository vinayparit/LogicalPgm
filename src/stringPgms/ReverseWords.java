package stringPgms;

public class ReverseWords {

	public static void main(String[] args) {

		String s = "Hi Hello WElcome to";
		String[] st = s.split(" ");

		for (int i = 0; i <= st.length - 1; i++) {

			String word = st[i] + " ";

			for (int j = word.length() - 1; j >= 0; j--) {
				System.out.print(word.charAt(j) + "");
			}
		}
		

	}
}
