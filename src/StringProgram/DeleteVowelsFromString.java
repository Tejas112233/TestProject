package StringProgram;

public class DeleteVowelsFromString {

	public static void main(String[] args) {
		// Java program to delete vowels in a given string.
		String str="This is a test";
		String str1="";
		for(int i=0;i<str.length();i++){
			char ch= str.charAt(i);
			if(ch != 'a' && ch !='e' && ch !='i' && ch != 'o' && ch !='u'){
				str1=str1+ch;
			}
			
		
		}
		System.out.println(str1);

	}

}
