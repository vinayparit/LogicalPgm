package PatternPgm;

public class Pgm3 {

	public static void main(String[] args) {
//		output:
//			* * * * * 
//			* * * * 
//			* * * 
//			* * 
//			*   
		for(int i =1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
