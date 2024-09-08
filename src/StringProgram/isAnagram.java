package StringProgram;

import java.util.Arrays;

public class isAnagram {
//Write a program in Java to check if two String are Anagram.

	public static void main(String[] args) {
		String str1 = "Listen";
		String str2= "Silent";
		
		char[] str1Array= str1.toLowerCase().toCharArray();
		char[] str2Array= str2.toLowerCase().toCharArray();
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		
		
		if(Arrays.equals(str1Array, str2Array)){
			System.out.println("Strings are anagram");
		}
		
		else{
			System.out.println("String are not anagram");
		}
	}
	
}
