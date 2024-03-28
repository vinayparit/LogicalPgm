package stringPgms;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Bangalore";

//		1st method
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
			
		}
		
//		2nd method
		
		char[] x=s.toCharArray();
		for (int i = x.length-1;i>=0;i--) {
			System.out.print(x[i]);
			}
		
//		3rd Method
		
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.print(sb);
		
//		4th Method
		
		
		
	}
}
