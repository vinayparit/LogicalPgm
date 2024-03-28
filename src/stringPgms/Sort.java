package stringPgms;

public class Sort {

	public static void main(String[] args) {

		String st = "a1b&3$c";
		char[] s = st.toCharArray();
		String alpha="";
		String num="";
		String spcl="";
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 'a' && s[i] <= 'z') {
				alpha=alpha+s[i];
			} else if (s[i] >= '0' && s[i] <= '9') {
				num=num+s[i];
			} else {
				spcl=spcl+s[i];
			}
		}
		System.out.println(alpha+ " "+ num+ " "+ spcl);
	}
}
