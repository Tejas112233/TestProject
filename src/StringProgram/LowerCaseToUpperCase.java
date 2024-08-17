package StringProgram;

public class LowerCaseToUpperCase {

	public static void main(String[] args) {
		// Java program to convert lowercase char to uppercase of string.
		String str="Tejas";
		String str2="";
		for(int i=0; i< str.length(); i++)	{
			str2=str2+ Character.toUpperCase(str.charAt(i));
		}
		System.out.println(str2);
		
	}

}
