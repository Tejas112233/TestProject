package ArrayPrograms;

public class ContainsSpecificValueInArray {
	public static void main(String[] args){
		//Write a Java program to test if an array contains a specific value.
		int a= 12;
		int[] arr={1,3,5,8,12,5};
		boolean result= false;
		for(int i:arr){
			if(i==a){
				result= true;
				break;
			}
		}
		if(result==true){
			System.out.println("The array constains the defined value.");
		}
		else{
			System.out.println("The array does not contains the defind value.");
		}
	}

}
