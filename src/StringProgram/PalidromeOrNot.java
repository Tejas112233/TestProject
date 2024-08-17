package StringProgram;

public class PalidromeOrNot {

	public static void main(String[] args) {
		//Write a program in Java to check a String is palindrome or not.
		String str1= "aba";
		String str2="";
		
		for(int i= str1.length()-1; i>=0; i--){
			str2= str2+str1.charAt(i);
		}
		
		if(str1.equals(str2)){
			System.out.println("String is palidrome.");			
		}
		else{
			System.out.println("String is not palidrome.");
		}

	}

}
