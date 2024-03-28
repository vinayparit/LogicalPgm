package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPgm {

	
	public static void main(String[] args) {
		
		HashMap<Integer, Object> map=new HashMap<Integer, Object>();
		
		map.put(10, "hi");
		map.put(11, 'a');
		map.put(12, null);
		map.put(13, 80);
		map.put(14, "RCB");
		map.put(15, "ESCN");
		map.put(16, null);
		map.put(null, null);
		map.put(null, 10);
		System.out.println(map);
		System.out.println(map.containsKey(14));
		System.out.println(map.containsValue("ESCN"));
		System.out.println(map.containsKey(20));
		System.out.println(map.replace(16, "Win"));
		
		for (Entry<Integer, Object> m:map.entrySet())
		{
			System.out.println(m.getKey()+ "  " +m.getValue());
		} 
	}
}
