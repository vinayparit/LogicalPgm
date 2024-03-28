package arrayPgms;

import java.util.Arrays;

public class PrintFrequentlyNumFirst {

	public static void main(String[] args) {
		int[] a = { 0, 4, 0, 2, 0, 6 };
		int[] b = new int[a.length];
		int m = 0;
		int n = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					b[m] = a[i];
					m++;
				} else if(count<=0) {
					b[n] = a[i];
					n--;
					count++;
				}
			}
			System.out.println(Arrays.toString(b));
		}

	}
}
