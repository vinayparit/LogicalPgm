package stringPgms;

public class NumberOfWords {

	
	public static void main(String[] args) {
		String s="Hi to Hello Welcome to";
		String[] st=s.split(" ");
		for (int i=0;i<st.length;i++)
		{
			int count=0;
			for (int j = 0; j < st.length; j++) {
				
				if (st[i].equals(st[j])) {
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
				System.out.println(st[i]+" " +count);
			}
		}
	}
	
}
