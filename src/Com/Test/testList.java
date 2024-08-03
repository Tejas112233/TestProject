package Com.Test;

import java.util.*;
public class testList {
	public static void main(String[] args){
		System.out.println("Tejas");
		int[] a= {1,3,5,8,0,1,0};
		List<Integer> l1= new ArrayList<Integer>();
		
		for(int i :a){
			l1.add(i);
		}
		System.out.println(l1);
		
		

	}
}
