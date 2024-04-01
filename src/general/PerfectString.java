package general;

public class PerfectString {

	public static void main(String[] args) {
		/*Output: 
		 * am from bangalore I 
		 * from bangalore I am 
		 * bangalore I am from 
		 * I am from bangalore
		 */

		String s = "I am from bangalore";
		String[] st = s.split(" ");

		for (int i = 0; i < st.length; i++) {
			String temp = st[0];

			for (int j = 1; j < st.length; j++) {

				st[j - 1] = st[j];
				System.out.print(st[j] + " ");
			}
			st[st.length - 1] = temp;
			System.out.println(st[st.length - 1] + " ");
		}
	}
}
