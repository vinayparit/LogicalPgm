package arrayPgms;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		
		int [] a= {1,2,3};
		int [] b= {4,5,6,7};
		int [] c=new int[0];
		
		int index=0;
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>a[i])
			{
				c=Arrays.copyOf(c, c.length+1);
				c[index++]=a[i];
			}
			else if(c[i]>b[i])
			{
				c=Arrays.copyOf(c, c.length+1);
				c[index++]=b[i];
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
