package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetPgm {

	public static void main(String[] args) {
		
		
		LinkedHashSet<Object> set=new LinkedHashSet<Object>();
		// Insertation Order is maintained
		set.add('a');
		set.add(null);
		set.add("ABC");
		set.add(10);
		set.add('a');
		set.add(null);
		set.add("25");
		
		System.out.println(set);
		
	}
}
