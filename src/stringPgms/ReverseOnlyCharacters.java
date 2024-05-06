package stringPgms;

public class ReverseOnlyCharacters {

	public static void main(String[] args) {
		
	/*o/ $4l #34$2l
	 * output: ol$4l#e3e$2/h
	 * 		o2$ 3#l 4$4/l   
	 */
		
		String s="h2$e3#el4$l/o";
		String s1=s.replaceAll("[^A-Z a-z 0-9]", "");
		int c=s1.length()-1;
		
		for (int i = 0;i<s.length();i++) {
			if(s.charAt(i)>='a'&& s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				System.out.print(s1.charAt(c--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
			
		}
	}
}
