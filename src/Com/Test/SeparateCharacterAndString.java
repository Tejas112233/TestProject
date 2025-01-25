package Com.Test;

public class SeparateCharacterAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st= "Test1234ssfd";
		String stChar="";
		String stInt="";
		for(char c: st.toCharArray()){
			if(Character.isLetter(c)){
				stChar=stChar+c;
			}
			else if(Character.isDigit(c)){
				stInt=stInt+c;
			}
				
		}
		
		System.out.println("CharacterString- "+ stChar);
		System.out.println("IntegerString- "+ stInt);

	}

}
