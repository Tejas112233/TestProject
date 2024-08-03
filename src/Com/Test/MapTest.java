package Com.Test;

import java.util.*;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(1,  "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		System.out.println("Map- "+map);
		System.out.println("values- "+ map.values());
		System.out.println("Key- "+ map.keySet());
		System.out.println("EntrySet- "+map.entrySet());
		
		//Traversing by Key
		for (int i:map.keySet()){
			System.out.println(i);
		}
		
		//Traversing by Value-
		for (String j: map.values()){
			System.out.println(j);
		}
		
		//Traversing from Entry
		for (Entry e:map.entrySet()){
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		//using iterator
		Iterator itr = map.keySet().iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		
		

	}

}
