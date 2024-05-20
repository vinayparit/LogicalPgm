package arrayPgms;

import java.util.Arrays;

public class StoreEvenNumberInAnotherArray {

	public static void main(String[] args) {

		int[] a = { 2,1993, 1887, 168, 1, 2022, 123, 56,50 };
		int[] even = new int[0];
		int index = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even = Arrays.copyOf(even, even.length + 1);

				even[index++] = a[i];
			}
		}
		System.out.println(Arrays.toString(even));
//		for (int i = 0; i < even.length; i++) {
//			System.out.println(even[i]);
//		}
	}
}
