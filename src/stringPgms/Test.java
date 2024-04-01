package stringPgms;

public class Test 
{
	public static void main(String[] args)
	{

		String s = "aabbabc";

		/*
		 * Outputs: 1) a3b3c1 -------- 2) a2b2a1b1c1 -------- 
		 * 3) aa 
		 * 	  bb 
		 *    a 
		 *    b 
		 *    c
		 */

		for (int i = 0; i < s.length(); i++) {
			int c = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))

					if (i > j) {
						break;
					} else {
						c++;
					}
			}
			if (c >= 1) {
				System.out.print(s.charAt(i) + "" + c);
			}
		}
		// --------------------------------------------
		System.out.println();
		System.out.println("------");
		int c = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				c++;
			} else {
				System.out.print(s.charAt(i) + "" + c);
				c = 1;
			}
		}	
		System.out.println(s.charAt(s.length() - 1) + "" + c);
//		----------------------------------------------------
		
		System.out.println("--------");
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				System.out.print(s.charAt(i));
			}
			else
			{
				System.out.println(s.charAt(i)); 
			}
		}
		System.out.println(s.charAt(s.length()-1));  
	}
}
