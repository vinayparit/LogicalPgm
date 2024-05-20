package stringPgms;

public class Punjab {

	public static void main(String[] args) {
		int a=10;
		String s = "I am from punjab";
		String[] st = s.split(" ");
		String n = st[2];
		String rev = new StringBuilder(n).reverse().toString();
//		System.out.println(rev);
		
		for (int i = 0; i < st.length; i++) {
			if (st[i] == n) {
				st[i] = rev;
			}
			System.out.print(st[i]+" ");
		}

	}

}
