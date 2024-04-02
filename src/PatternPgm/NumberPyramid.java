package PatternPgm;

public class NumberPyramid {

	public static void main(String[] args) {
/*
         1         
      2   2       
    3   3   3     
  4   4   4   4   
5   5   5   5   5 

 */
		int n = 5;
		int x = 1;

		for (int i = 1; i <= n; i++) {
			int n2 = n + 1;
			for (int j = 1; j <= n * 2 - 1; j++) {
				if (i + j >= n + 1 && j - i <= n - 1 && i + j == n2) {
					System.out.print(x + " ");

					n2 = n2 + 2;
				} else {
					System.out.print("  ");
				}
			}
			x++;
			System.out.println();
		}
	}
}
