package PatternPgm;

public class Pgm9 {

	public static void main(String[] args) {
		
		/*
1
22
333
4444
55555
		 */
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
