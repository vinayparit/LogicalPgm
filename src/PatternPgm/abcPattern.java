package PatternPgm;

public class abcPattern {

	public static void main(String[] args) {
		/*Output:
		a 
      b b 
    c c c 
  d d d d 
e e e e e 
		 */
		int n=5;
		char c='a';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j>=n+1)
				{
					System.out.print(c+" ");
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

