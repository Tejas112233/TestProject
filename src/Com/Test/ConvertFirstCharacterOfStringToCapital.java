package Com.Test;

public class ConvertFirstCharacterOfStringToCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st= "my name is tejas";
		String st2 ="";
		String[] stArr= st.split(" ");
		for(String s: stArr){
			String s2= s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
			st2= st2+s2+ " ";
		}
		System.out.println(st2.trim());
		

	}

}
