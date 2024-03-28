package stringPgms;

public class LenghtOfString {

	public static void main(String[] args) {
		String st = "a1b2c3d";
		char[] s = st.toCharArray();
		int sum = 0;
		for (int i = 0; i < st.length(); i++) {

			if (s[i] >= '0' && s[i] <= '9') {
				int n = st.charAt(i) - 48;
				sum = sum + n;
			}

		}
		System.out.println(sum);

	}
}
