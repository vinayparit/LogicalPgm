package general;

public class MissingNumber {

	public static void main(String[] args) {
		int[] a= {1,3,4,6,9};
		
		
		for(int i=0;i<10;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(i==a[j])
				{
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(i+" missing number");
			}
		}
		
		
	}
}
