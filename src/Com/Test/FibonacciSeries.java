package Com.Test;

public class FibonacciSeries {

	public static void main(String[] args){
		int n= 10;
		int firstNum= 0;
		int secNum= 1;
		int sum=0;
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for(int i=2; i<n; i++){
			sum= firstNum+ secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
			
		}
		
	}
	
	
}
