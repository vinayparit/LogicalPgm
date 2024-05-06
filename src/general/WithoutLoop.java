package general;

public class WithoutLoop {
	public static void print(int n) {

		if (n<=10) {
			System.out.print(n + " ");
			print(n + 1);
		}
	}

	public static void main(String[] args) {
		print(1);
	}
}
