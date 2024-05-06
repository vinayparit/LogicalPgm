package general;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		
		
		for(int i=0;i<=x;i++)
		{
			int count=0;
			int n=i;
			int j;
			for(j=2;j<n;j++)
			{
				if(n%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(n+ " Prime");
			}
			else
			{
				System.out.println(n+" Not Prime");
			}
		}
	
	}
	
}
