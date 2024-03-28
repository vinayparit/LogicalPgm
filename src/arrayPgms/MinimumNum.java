package arrayPgms;

public class MinimumNum {

	public static void main(String[] args) {

		int[] a = { 10, 5, 7, 3, 1, 8 };
		int fMin = a[0];

		for (int i = 0; i < a.length; i++)
		// i=0 0<6 True a[i]=10
		// i=1 1<6 True a[i]=5
		// i=2 2<6 True a[i]=7
		// i=3 3<6 True a[i]=3
		// i=4 4<6 True a[i]=1
		// i=5 5<6 True a[i]=8
		// i=6	6<6 False Terminate	
			
//		6 = a.length	

		{
			if (fMin > a[i]) 
			
			{
				fMin = a[i];
			}
		}
		System.out.println(fMin);
	}
}
