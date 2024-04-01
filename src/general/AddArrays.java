package general;

public class AddArrays {

	public static void main(String[] args) {
		int[] a= {4,3,1,2,5};
		int[] b= {3,4,6,7};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				int sum=0;
				if(i==j)
				{
					sum=a[i]+b[j];
					System.out.print(sum+" ");
				}
			}
		}
		System.out.println(a[a.length-1]);
	}
	
	
}
