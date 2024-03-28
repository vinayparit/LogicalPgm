package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPgm {

	
	public static void main(String[] args) {
		
		HashSet<Object> set=new HashSet<Object>();
		set.add('a');
		set.add(null);
		set.add("ABC");
		set.add(10);
		set.add('a');
		set.add(null);
		set.add("25");
		
		System.out.println(set);
		
		ArrayList<Object> list=new ArrayList<Object>(set);
		list.add("a");
//		list.add(set);
		list.add(null);
		
		Iterator<Object> i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
