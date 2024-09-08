package StringProgram;

public class InterViewQuestion {

	public static void main(String[] args) {
		// input String TtteeEJjjjAaaaSsss 			Output String- TejaS
		String st ="TtteeEJjjjAaaaSsss";
		String st2=st.toLowerCase();
		String st3=""+st2.charAt(0);
		String st4="";
		for(int i=1; i<st2.length(); i++){
			if(st2.charAt(i-1)!=st2.charAt(i)){
				st3= st3+st2.charAt(i);
			}		
		}	
		
		st4=st3.substring(0,1).toUpperCase()+st3.substring(1,st3.length()-1)+ st3.substring(st3.length()-1,st3.length()).toUpperCase();
		
		System.out.println(st4);
		
	}

}
