package stringPgms;

public class MaximumLenghtOfInArray {

public static void main(String[] args) {
		
		String[] s= {"ab","abc","abcd","cd","cdgf"};
//		Output= abcd cdgf
		
		String maxLenght=s[0];
		
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()>maxLenght.length())
			{
				maxLenght=s[i];
			}
			
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()==maxLenght.length())
			{
				System.out.print(s[i]+" ");
			}
			
		}
 	}
}
