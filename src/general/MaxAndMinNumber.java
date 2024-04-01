package general;

public class MaxAndMinNumber {

	public static void main(String[] args) {

		int[] a = { 4, 0, 5, 1, 0, 3, 5 };

		int min1St = a[0];
		int min2Nd = a[0];
		int max1 = a[0];
		int max2 = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min1St) {
				min1St = a[i];
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min2Nd && a[i] > min1St) {
				min2Nd = a[i];
			}
		}
		System.out.println("1st Minimum " + min1St);
		System.out.println("2nd Minimum " + min2Nd);
	}
}
