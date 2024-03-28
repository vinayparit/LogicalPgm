package stringPgms;

public class ReverseCompleteStringSet {

	
	public static void main(String[] args) {
		String s="Hi Hello Welcome to";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
			
		}
		System.out.println();
		String [] st=s.split(" ");
		
		for (int i = st.length - 1; i >= 0; i--) {
			System.out.print(st[i]+" ");
			
			
		}
		System.out.println();
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]+" ");
		}
		
	}
}
