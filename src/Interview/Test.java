package Interview;

public class Test {

	
	public static void main(String[] args) {
		
		String st="I love india";
		String[] s=st.split(" ");
//		String rev=" ";
		for(int i=s.length-1;i>=0;i--)
		{
//			rev=rev+s[i];
			System.out.print(s[i]+" ");
	}
}
}