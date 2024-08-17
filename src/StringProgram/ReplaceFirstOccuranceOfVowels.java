package StringProgram;

public class ReplaceFirstOccuranceOfVowels {

	public static void main(String[] args) {
		//Java program to Replace First Occurrence Of Vowel With ‘-‘ in String.
		String st= "This is test string.";
		String st1= "";
		boolean isReplaced= false;
		for(int i=0; i<st.length();i++){
			char c= Character.toLowerCase(st.charAt(i));
			if((c=='a' || c== 'e' || c== 'o' || c=='u' || c=='i') && isReplaced == false){
				st1=st1+'-';
				isReplaced = true;
			}
			else{
				st1= st1+st.charAt(i);
			}
		}
		System.out.println(st1);

	}

}
