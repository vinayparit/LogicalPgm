package stringPgms;

public class Hello {

	public static void main(String[] args) {
		/*
		 * Output
		 * H_e__l___l____o
		 */
		String s="Hello";
		String a="";
		for(int i=0;i<s.length();i++)
		{
			a=a+" ";
			System.out.print(s.charAt(i)+a);
		}
				
	}
}
