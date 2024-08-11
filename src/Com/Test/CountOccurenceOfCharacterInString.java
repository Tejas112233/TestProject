package Com.Test;

public class CountOccurenceOfCharacterInString {

	public static void main(String[] args) {
		//Write a program in Java to count occurrence of a given character in a String.

		String str= "Tejcasc c";
		char ch= 'c';
		int count=0;
		for (char c: str.toCharArray()) {
			if(c==ch) {
				count++;
			}
		}
		System.out.println("Outpur "+count );

	}

}
