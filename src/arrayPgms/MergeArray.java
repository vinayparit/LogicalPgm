package arrayPgms;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		
		int [] a= {10,11,151,2,3};
		int [] b= {4,5,6,7};
		int [] c= new int[a.length+b.length];
		
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}

	
}
