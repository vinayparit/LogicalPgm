package general;

import java.util.Scanner;

public class DisplayNext5Letters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		System.out.println("Enter Number of Character to be displayed: ");
		Character ch = sc.next().charAt(0);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			ch++;
			if (ch > 'z') {
				ch = 'A';
			} else if (ch > 'z' && ch < 'a') {
				ch = 'a';
			}
			System.out.println(ch);
		}
	}
}
