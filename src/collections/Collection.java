

package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		list1.add(40);
		list1.add(30);
		list1.add(10);
		list1.add(5);
		Collections.sort(list1);
		
		ArrayList<Object> list=new ArrayList<Object>(list1);
		
		list.add(10);
		list.add(10.50);
		list.add('a');
		list.add("abc");
		list.add(10.50);
		list.add(null);
		list.add("10.50abc10");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains('a'));
		System.out.println(list.indexOf(null));
		list.remove(10.50);
		System.out.println(list);
	}
}
