package Com.Test;

public class FindDuplicateValueFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,4,2,8,0,1,8};
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]== arr[j]){
					System.out.println(arr[i] + " is Dupplicate value.");
					break;
				}

			}
		}
		

	}

}
