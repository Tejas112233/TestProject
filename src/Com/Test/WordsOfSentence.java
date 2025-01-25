package Com.Test;

public class WordsOfSentence {

	public static void main(String[] args) {
		String st= "This is test";
		
		System.out.println("--------------Method1-------------");
		String[] arr= st.split(" ");
		for(String s: arr){
			System.out.println(s);
		}
		
		System.out.println("--------------Method2-------------");
		for (int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

	}

}
