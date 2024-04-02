package general;

public class PrimeNumberInArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int count=0;
			for(int j=2;j<n;j++)
			{
				if(n%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(a[i]+ " Prime");
			}
			else
			{
				System.out.println(a[i]+" Not Prime");
			}
		}
	}
}
