package ArrayPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortNumericArray {

	public static void main(String[] args) {
		// Write a Java program to sort a numeric array and a string array.
		
		//Method 1- by compare and sort
		int[] intArray = {1,4,2,6,5};
		for (int i=0;i<intArray.length; i++){
			System.out.print(intArray[i] + " ");
		}
		
		
		
		for( int i=0; i<intArray.length;i++){
			for ( int j=i+1; j<intArray.length; j++){
				if(intArray[i]>intArray[j]){
					int temp= intArray[i];
					intArray[i]=intArray[j];
					intArray[j]= temp;
				}
				
			}
		}
		System.out.println("");
		for (int i=0;i<intArray.length; i++){
			System.out.print(intArray[i] + " ");
		}
		
		
		
		//Method2 = by using in built Arrays.sort() method
		int intArray2[] = {14,53,33,56};
		Arrays.sort(intArray2);
		
		System.out.println("");
		for (int i=0;i<intArray2.length; i++){
			System.out.print(intArray2[i] + " ");
		}
		
		
		
		

	}

}
