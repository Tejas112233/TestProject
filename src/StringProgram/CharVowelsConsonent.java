package StringProgram;

public class CharVowelsConsonent {

	public static void main(String[] args) {
		// Java program to check given character is vowel or consonant.
		
		char c='E';
		
		if (Character.toLowerCase(c)== 'a' || Character.toLowerCase(c)=='e' || Character.toLowerCase(c)=='i' || Character.toLowerCase(c)== 'o' || Character.toLowerCase(c)== 'u'){
			System.out.println("Character is Vowel.");
		}
		else{
			System.out.println("Character is Consonent.");
		}

	}

}
