package PatternPgm;

public class Pgm6 {

	public static void main(String[] args) {
		
//Output:
//		*****
//		****
//		***
//		**
//		*

		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=n-1;j>=1;j--)
			{
				System.out.print(""); 
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
