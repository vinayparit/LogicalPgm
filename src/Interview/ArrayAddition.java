package Interview;

public class ArrayAddition {

	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 4, 5, 6, 7, 8 };
		int maxLength = Math.max(a1.length, a2.length); //Compares the length on arrays
		int[] res = new int[maxLength];

		for (int i = 0; i < res.length; i++) {
			int sum = 0;
			if (i < a1.length) {
				sum =sum+ a1[i];
			}
			if (i < a2.length) {
				sum =sum+ a2[i];
			}
			res[i] = sum;
			
		}
		for (int i : res) {
			System.out.print(i + " ");
		}
	}
}
