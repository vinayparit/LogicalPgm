package PatternPgm;

public class Pgm1 {

	public static void main(String[] args) {

	/*output:
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 	  
	 */
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
