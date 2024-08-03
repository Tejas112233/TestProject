package Com.Test;

public class reverseString {

	public static void main(String[] args) {
		//Method1
		
		String st= "Tejas";
		StringBuilder sb= new StringBuilder(st);
		System.out.println(sb.reverse());
		
		//Method2
		String revString="";
		for(int i= st.length()-1; i>=0; i--){
			revString=revString+st.charAt(i);
		}
		System.out.println(revString);
		
		

	}

}
