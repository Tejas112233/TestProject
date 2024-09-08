package StringProgram;

public class CountAlphabetDigitAndSpChar {

	public static void main(String[] args) {
		// Java program to count alphabets, digits and special characters.
		String st= "This is a test 11, 22";
		int alpha =0;
		int digit =0;
		int spChar =0;
		for(char c: st.toCharArray()){
			if(Character.isLetter(c)){
				alpha++;
			}
			else if(Character.isDigit(c)){
				digit++;
			}
			else{
				spChar++;
			}
		}
		
		System.out.println("Alphabet- "+ alpha);
		System.out.println("Digit- "+ digit);
		System.out.println("spChar- "+ spChar);

	}

}
