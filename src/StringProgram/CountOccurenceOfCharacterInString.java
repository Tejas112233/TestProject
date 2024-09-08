package StringProgram;

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
		System.out.println(str.indexOf('c'));
		System.out.println(str.lastIndexOf('c'));

	}

}
