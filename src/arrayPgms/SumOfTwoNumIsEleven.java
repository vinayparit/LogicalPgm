package arrayPgms;

import java.util.*;

public class SumOfTwoNumIsEleven {

	public static void main(String[] args) {
		int[] a = { 8, 4, 7, 7, 6, 3, 2, 5, 6, 9 };
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int result=sc.nextInt();
//		int result = 10;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.addAll(set);
		System.out.println(arr);

		for (int i = 0; i < arr.size(); i++) {
			for (int j = i; j < arr.size(); j++) {
				if (arr.get(i) + arr.get(j) == result) {
					System.out.println(arr.get(i) + "+" + arr.get(j) + "=" + result);
				}
			}
		}
	}
}
