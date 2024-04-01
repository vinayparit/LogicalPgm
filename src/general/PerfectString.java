package general;

public class PerfectString {

	public static void main(String[] args) {
		
		String s="I am from bangalore";
		String[] st=s.split("");
//		String[] str=new String[st.length];
		String temp =null;
		
		for(int i=1;i<st.length;i++)
		{
			temp= st[0];
			st[i]=st[i+1];
		
//			System.out.print(st[i]+"");
//			st[st.length-1]=temp;
			System.out.print(st[i]);
		}
		
	} 
}
