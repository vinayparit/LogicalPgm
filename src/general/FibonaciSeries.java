package general;

public class FibonaciSeries {

	public static void main(String[] args) {

		int n = 0;
		int m = 1;
		int o = 0;
		for (int i = 0; i < 10; i++) {
			o = n + m;
			System.out.print(" " + o);
			n = m;
			m = o;
		}
	}
}
