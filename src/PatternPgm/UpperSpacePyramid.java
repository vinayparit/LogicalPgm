package PatternPgm;

public class UpperSpacePyramid {

	public static void main(String[] args) {
		/*Output: 
		a         
      b   b       
    c   c   c     
  d   d   d   d   
e   e   e   e   e 

		 */
		
		int n=5;
		char c='a';
		
		for(int i=1;i<=n;i++)
				{
			int n2=n+1;
			for(int j=1;j<=n*2-1;j++)
			{
				if(i+j>=n+1 && j-i<=n-1 && i+j==n2)
				{
					System.out.print(c+" ");
					n2=n2+2;
				}
				else
				{
					System.out.print("  ");
				}
			}
			c++;
			System.out.println();
		}
	}
}
