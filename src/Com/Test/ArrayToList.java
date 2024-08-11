package Com.Test;
import java.util.*;
public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,0,4,0,0,6,9};
		List<Integer> list= new ArrayList<Integer>();
		for (int i:a){
			list.add(i);
		}
		
		System.out.println(list);
		
		// moving all zeros to last
		for (int j:a){
			if (j==0){
				list.remove(list.indexOf(j));
				list.add(0);
			}
		}
		
		System.out.println(list);
		System.out.println(System.getProperty("user.dir"));
		
		}
	
	
	

}
