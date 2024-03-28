package stringPgms;

public class MinimumShortestLenghtInArray {

	public static void main(String[] args) {
		
		String[] s= {"ab","abc","abcd","cd","cdgf"};
//		Output= ab cd
		
		String minLenght=s[0];
		
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()<minLenght.length())
			{
				minLenght=s[i];
			}
			
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()==minLenght.length())
			{
				System.out.print(s[i]+" ");
			}
			
		}
 	} 
}
