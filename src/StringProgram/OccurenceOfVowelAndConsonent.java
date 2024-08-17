package StringProgram;

public class OccurenceOfVowelAndConsonent {

	public static void main(String[] args) {
		// Java program to count Occurrence Of Vowels & Consonants in a String.
		
		String st= "This is test";
		int vowels=0;
		int consonents =0;
		
		for (char s: st.toCharArray()){
			char c= Character.toLowerCase(s);
			if(c=='a' || c=='e' || c=='i' || c =='o' || c== 'u'){
				vowels++;
			}
			else{
				consonents++;
			}
				
		}
		
		System.out.println("Vowels- "+ vowels);
		System.out.println("consonents- "+ consonents);

	}

}
