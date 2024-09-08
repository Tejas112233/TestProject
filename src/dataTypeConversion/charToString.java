package dataTypeConversion;

public class charToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c= 'a';
		String st;
		st= Character.toString(c);
		System.out.println(st);
		
		st= String.valueOf(c);
		System.out.println(st);
		
		
		char c1= '1';
		String st1= Character.toString(c1);
		System.out.println(st1);
		
		st1= String.valueOf(c1);
		System.out.println(st1);
		
	}

}
