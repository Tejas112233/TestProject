package StringProgram;

public class LoweCaseVowelToUpperCase {

	public static void main(String[] args) {
		// Java program to convert lowercase vowel to uppercase in string.
		String str= "This is test";
		String str2 ="";
		for (int i=0; i<str.length(); i++){
			if(str.charAt(i)=='a' || str.charAt(i)=='e'  || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'  ){
				str2=str2+Character.toUpperCase(str.charAt(i));
			}
			else
			str2= str2+str.charAt(i);
		}
		System.out.println(str2);
	}

}
