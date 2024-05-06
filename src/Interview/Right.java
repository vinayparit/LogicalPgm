package Interview;

public class Right {

	
	public static void main(String[] args) {
		int n=5;
		
		for (int i = 0, j=0;i<n;) {
			
			if(j>=i)
			{
				System.out.print("* ");
				j++;
			}
			else
			{
				System.out.println();
				j=0;
				i++;
			}
		}
	}
}
