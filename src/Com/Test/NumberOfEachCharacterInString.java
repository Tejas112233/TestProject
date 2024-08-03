package Com.Test;

import java.util.*;
public class NumberOfEachCharacterInString {

	public static void main(String[] args) {
		String st= "This is tejas tejas.";
		Map<Character,Integer> map= new HashMap<Character, Integer>();
		char[] ch= st.toCharArray();
		for(char c:ch){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		System.out.println(map);

	}

}
