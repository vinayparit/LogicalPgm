package PatternPgm;

public class EdcbaPattern {

	public static void main(String[] args) {
		/*Output:
e e e e e 
d d d d   
c c c     
b b       
a    
		 */
		int n=5;
		char c='e';
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n+1)
				{
					System.out.print(c+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			c--;
			System.out.println();
		}
	}
}
