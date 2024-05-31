package Interview;

public class StrinigCompare {

	public static void main(String[] args) {
		String s1="Sachin"; 

		String s2="Sachin"; 
		 s1=s1+"abc";

		String s3=new String("Sachin"); 

		String s4="Saurav"; 
		

		System.out.println(s1.equals(s2)); 

		System.out.println(s1.equals(s3)); 

		System.out.println(s1.equals(s4)); 

	}
}
