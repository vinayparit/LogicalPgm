package stringPgms;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String s="gadag";
		String rev="";
		int sLenght=s.length();
		
		for (int i = sLenght-1; i >=0; i--) {
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("Palindrome value :" +rev); 
		}
		else
		{
			System.out.println("Not Palindrome"); 
		}
	}
}
