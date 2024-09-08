package ArrayPrograms;

public class SumValuesOfArray {

	public static void main(String[] args) {
		// Write a Java program to sum values of an array.
		int[] arr= {1,5,4,9,10};
		int sum= 0;
		for(int a:arr){
			sum= sum+a;
		}
		System.out.println(sum);

	}

}
