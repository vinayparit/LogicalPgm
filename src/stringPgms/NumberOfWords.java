package stringPgms;

public class NumberOfWords {

	
	public static void main(String[] args) {
		String s="Hi to Hello Welcome to".replace(" ", "");
//		String[] st=s.split(" ");
		for (int i=0;i<s.length();i++)
		{
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				
				if (s.charAt(i)==s.charAt(j)) {
					if(i>j)
					{
						break;
					}
					else
					{
						count++;
					}
				}
			}
			if(count>=1)
			{
				System.out.println(s.charAt(i)+" " +count);
			}
		}
	}
	
}
