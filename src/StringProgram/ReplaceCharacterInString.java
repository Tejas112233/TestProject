package StringProgram;

public class ReplaceCharacterInString {

	public static void main(String[] args) {
		// Java program to replace the string space with a given character.
		String str= "This is test";
		char c='a';
		String str2="";
		for (int i=0; i<=str.length()-1; i++){
			if(str.charAt(i) != ' '){
				str2 = str2+ str.charAt(i);
			}
			else{
				str2=str2+ c;
			}
		}
		System.out.println(str2);
		

	}

}
