package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {

	public static void main(String[] args) {
		//Declaration
		 List<Integer> li= new ArrayList<Integer>();
		 
		 
		 //Add element
		 for (int i=0; i<=10; i++){
			 li.add(i);
		 }
		 System.out.println(li);
		 
		 li.add(4);
		 
		 //Remove Element 
		 li.remove(2);
		 System.out.println(li);

		 //iterate using listIteratior
		 Iterator itr = li.listIterator();
		 
		 while(itr.hasNext()){
			 System.out.println(itr.next());
		 }
		 
		 li.forEach(i->System.out.println(i));
		 
		 
			 
		 
		 

		
		 
		 

	}

}
