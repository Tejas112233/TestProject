package Com.Test;

import java.util.*;

public class numberOfCharacterDigit {

	public static void main(String[] args) {
		String st = "1. This is statement.";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int ch = 0;
		int i = 0;
		int sCh = 0;
		int cCh = 0;
		int sp = 0;
		int wSp = 0;
		char[] chArray = st.toCharArray();
		for (char s : chArray) {
			if (Character.isLetter(s)) {
				ch++;
				if (Character.isUpperCase(s))
					cCh++;
				else
					sCh++;
			} else if (Character.isDigit(s)) {
				i++;
			} else if (Character.isWhitespace(s)) {
				wSp++;
			} else {
				sp++;
			}

		}

		System.out.println("Integer- " + i);
		System.out.println("Character-  " + ch);
		System.out.println("UpperCase- " + cCh);
		System.out.println("LowerCase- " + sCh);
		System.out.println("WhiteSpace- " + wSp);
		System.out.println("Special Character- " + sp);
	}

}
