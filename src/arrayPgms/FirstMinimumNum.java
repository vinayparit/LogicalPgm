package arrayPgms;

public class FirstMinimumNum {

	public static void main(String[] args) {
		int[] a = { 10, 5, 7, 3, 1, 8 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);

		}
		System.out.println("1st Minimum Num " + a[0]);
	}
}
