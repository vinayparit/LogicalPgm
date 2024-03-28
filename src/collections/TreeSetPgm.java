package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPgm {

	public static void main(String[] args) {
		TreeSet<Integer> set1=new TreeSet<Integer>();
		
		//No duplicates are allowed & auto sorting
		set1.add(25);
		set1.add(11);
		set1.add(15);
		set1.add(17);
		set1.add(17);
		
		System.out.println(set1);
		
		TreeSet<String> set2=new TreeSet<String>();
		
		//No duplicates are allowed & auto sorting
		set2.add("abc");
		set2.add("abcd");
		set2.add("abce");
		set2.add("abcg");
		set2.add("cf");
		set2.add("bc");
		set2.add("abcd");
		
		System.out.println(set2); 
		Iterator<Integer> i = set1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}
}
