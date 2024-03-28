package arrayPgms;

public class SumOfTwoNumIsEleven {

	public static void main(String[] args) {
		int[] a= {8,4,7,3,2,5,6,9};
		int result=11;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]+a[j]==result)
				{
					System.out.println(a[i]+"+"+a[j]+"="+result);
				}
			}
		}
	}
}
