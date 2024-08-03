package Com.Test;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		aList.add("Test1");
		aList.add("Test3");
		aList.add("Test2");
		
		Iterator itr= aList.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		
		List<String> bList = new LinkedList<String>();
		bList.add("Test5");
		bList.add("List3");
		bList.add("List9");
		Iterator<String> ltr= bList.listIterator();
		while(ltr.hasNext()){
			System.out.println(ltr.next());
		}
		
		

	}

}
