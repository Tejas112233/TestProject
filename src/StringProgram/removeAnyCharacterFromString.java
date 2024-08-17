package StringProgram;

public class removeAnyCharacterFromString {

	public static void main(String[] args) {
		String str= "Tejas";
		char ch= 'T';
		String op="";
		
		for(char c:str.toCharArray()){
			if(c!=ch){
				op=op+Character.toString(c);
			}
		}
		
		System.out.println(op);

	}

}
