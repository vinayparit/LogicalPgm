package arrayPgms;

public class SwapTwoNum {

	public static void main(String[] args) {

		// With help of 3rd variable
		int a = 10;
		int b = 20;
	int c=a;
	a=b;
	b=c;
	System.out.println(a);
	System.out.println(b);

		// Without 3rd variable

		int i = 10;
		int j = 20;
	i=i+j;
	j=i-j;
	i=i-j;
	System.out.println("i " +i);
	System.out.println(j);
		
		

	}

}
