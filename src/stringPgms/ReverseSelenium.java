package stringPgms;

public class ReverseSelenium {

	
	public static void main(String[] args) {
		
		String s="I am selenium";
		String s1=s.replace(" ", "");
		System.out.println(s1);
		int j=s1.length()-1;
		for (int i =0; i< s.length(); i++) {
			if(s.charAt(i)!=' ')
			{
				System.out.print(s1.charAt(j--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	} 
}
