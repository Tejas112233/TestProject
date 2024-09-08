package StringProgram;
import java.util.*;
public class HighestFrequencyCharacter {

	public static void main(String[] args) {
		// Java program to print the highest frequency character in a String.
		String st= "This is a test program.";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int highestValue=0;
		char highestfreChar=st.charAt(0);
		for(char c: st.toCharArray()){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
				if(map.get(c)>highestValue && c !=' '){
					highestValue=map.get(c);
					highestfreChar=c;
				}
			}
			else{
				map.put(c, 1);
			}
		}
		
		System.out.println("Character- "+highestfreChar+ "  Frequency- "+highestValue);
		
		
	
		
	}

}
