package collections;

import java.util.LinkedList;

public class LinkedListPgm {

public static void main(String[] args) {
		
	LinkedList<Object> list=new LinkedList<Object>();

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
	list.addFirst(100);
	list.addLast("last element");
	System.out.println(list);
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	list.removeFirst();
	list.removeLast();
	System.out.println(list);
	for(Object obj:list)
	{
		System.out.println(obj);
	}
		}

}
