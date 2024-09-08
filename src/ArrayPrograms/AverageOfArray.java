package ArrayPrograms;

public class AverageOfArray {

	public static void main(String[] args) {
		// Write a Java program to calculate the average value of array elements
		int[] a={1,4,6,0,3,5};
		int sum= 0;
		
		for (int i=0; i<a.length; i++){
			sum= sum+ a[i];			
		}
		double avg = sum/a.length;
		System.out.println("Average- "+ avg);

	}

}
