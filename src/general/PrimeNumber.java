package general;



public class PrimeNumber {

	public static void main(String[] args) {
		
		for(int i=0;i<=30;i++)
		{
			int count=0;
			int n=i;
			int j=2;
			for(j=2;j<n;j++)
			{
				if(n%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(n+ " Prime");
			}
			else
			{
				System.out.println(n+" Not Prime");
			}
		}
	
	}
	
}
