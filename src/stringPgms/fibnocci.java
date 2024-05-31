package stringPgms;

import java.util.Scanner;

public class fibnocci {
//	public static void main(String[] args) {
//		int a = 0;
//		int b = 1;
//		for (int i = 0; i < 10; i++) {
//			System.out.print(a+" ");
//			int c=a+b;	
//			a=b;
//			b=c;
//			
//			
//		}
//	}
	 public static void main(String[] args) {
	         Scanner sc=new Scanner(System.in);
	         System.out.println("Enter the number");
	         int n=sc.nextInt();
	        
	        int a=0;
	        int b=1;
	        for(int i=0;i<n;i++)
	        {
	            int c=a+b;
	            System.out.print(c+" ");
	            a=b;
	            b=c;
	        }
	        
	    }
}
