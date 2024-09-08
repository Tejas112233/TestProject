package StringProgram;
import java.util.*;
public class OcurrenceOfDuplicateCharacter {

	public static void main(String[] args) {
		// Java Program to count the occurrence of duplicate characters in String
		//Count the duplicate characters in String using Java
		
		String str= "This is test program";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int noOfDuplicateChar=0;
		
		for (Character c: str.toCharArray()){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else 
			{
				map.put(c,1);
			}
		}
		
		for (Character s: map.keySet()){
			
			if(map.get(s)>1 && s!=' '){
				System.out.println(s + "-> "+ map.get(s));
				noOfDuplicateChar++;
			}
		}
		
		System.out.println("Number of Duplicate Character- "+ noOfDuplicateChar);

	}

}
