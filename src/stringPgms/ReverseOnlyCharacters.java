package stringPgms;

public class ReverseOnlyCharacters {

	public static void main(String[] args) {
		
	/*
	 * output: ol$4l#e3e$2/h
	 * 		   
	 */
		
		String s="h2$e3#el4$l/o";
		String s1=s.replaceAll("[^A-Za-z0-9]", " ");
		int c=s1.length()-1;
		
		for (int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i)>='a'&& s.charAt(i)<='z' || s.charAt(i)>=0 && s.charAt(i)<=9)
			{
				System.out.print(s.charAt(c--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
			
		}
	}
}
