package collections;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTablePgm {

	
	
	public static void main(String[] args) {
		
		Hashtable<Integer, Object> set=new Hashtable<Integer, Object>();
		
		//No duplicate keys and no null values
		set.put(10, 'a');
		set.put(20, "abc");
		set.put(3, 30);
		set.put(1, 14.25);
		set.put(2, 14.25);
//		set.put(2, null);
		
		System.out.println(set);
		System.out.println(set.containsKey(3));
		System.out.println(set.containsValue(14.2) );
		System.out.println(set.replace(2, "hi"));
		
		for(Entry<Integer, Object> h:set.entrySet()) 
		{
			System.out.println(h.getKey()+ "  " +h.getValue());
		}
		
		
		
		
	}
}
