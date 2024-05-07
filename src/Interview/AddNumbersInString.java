package Interview;

public class AddNumbersInString {

	public static void main(String[] args) {
		
		String s="12abcd1234";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			//checking if character is digit
			if(Character.isDigit(s.charAt(i)))
			{
				int num=s.charAt(i)-48; //converting character to int
				System.out.print(num+" ");
				sum=sum+num;
			}
		}
		System.out.println();
		System.out.println(sum);
	}
}
