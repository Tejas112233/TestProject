package Com.Test;

import java.util.Arrays;

public class LargestNumberFromArray {
//Method 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,2,66,4,11,99,4};
		int largestNum= arr[0];
		for(int i: arr){
			if(i >largestNum){
			largestNum=i;}
		}
		System.out.println(largestNum);
		
		
		//-----Method2-
		int[] arr2= {1,4,2,66,4,11,99,4};
		Arrays.sort(arr2);
		System.out.println(arr2[arr2.length-1]);

	}

}
