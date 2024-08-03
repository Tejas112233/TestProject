package Com.Test;
import java.util.*;
public class sortNumberInString {

	public static void main(String[] args) {
		String st= "11,2,5,1,40";
		String[] stArray= st.split(",");
		List<Integer> list = new LinkedList<Integer>();
		for (String s:stArray){
			list.add(Integer.parseInt(s.trim()));
		}
		Collections.sort(list);
		System.out.println(list);
		

	}

}
