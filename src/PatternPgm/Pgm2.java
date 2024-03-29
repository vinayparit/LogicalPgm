package PatternPgm;

public class Pgm2 {

	public static void main(String[] args) {
//		OutPut:
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	} 
}
