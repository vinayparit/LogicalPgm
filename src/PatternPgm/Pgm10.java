package PatternPgm;

public class Pgm10 {

	public static void main(String[] args) {
		/*
5
44
333
2222
11111
		 */
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
