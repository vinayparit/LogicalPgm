package stringPgms;

public class CountVowels {

	
	public static void main(String[] args) {
		
		String st="India";
		
		char[] s=st.toCharArray();
		int count=0;
		for (int i = 0; i < st.length(); i++) {
			if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
			{
				count++;
				System.out.println(s[i]+" ");
			}
		}
		System.out.println(count);
		
	}
}
