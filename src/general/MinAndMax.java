package general;

import java.util.Arrays;

public class MinAndMax {

	public static void main(String[] args) {

		int[] a = { 5, 2, 10, 100, 0 };

		Arrays.sort(a);
		System.out.println("Min: " + a[0] + " " + "Max: " + a[a.length - 1]);
	}
}
