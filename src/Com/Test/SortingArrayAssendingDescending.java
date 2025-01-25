package Com.Test;

import java.util.Arrays;

public class SortingArrayAssendingDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method 1
		int[] arr= {1,3,4,2,5,2,6,1};
		
		for(int i=0; i<arr.length; i++){
			for(int j= i+1; j<arr.length;j++){
				if(arr[j]>arr[i]){
					int temp= arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
			
		for(int i: arr){
			System.out.print(i + " ");
		}
		System.out.println("");
		for(int j=arr.length-1; j>=0;j--){
			System.out.print(arr[j]+ " ");
		}
		
		System.out.println("");
		// Method 2
		
		int[] arr2= {1,3,4,2,5,2,6,1};
		Arrays.sort(arr2);
		for(int i: arr2){
			System.out.print(i +" ");
		}
		
		System.out.println("");
		for(int j=arr2.length-1; j>=0; j--){
			System.out.print(arr2[j] + " ");
		}
	}

}
