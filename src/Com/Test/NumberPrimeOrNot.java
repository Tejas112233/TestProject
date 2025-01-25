package Com.Test;

public class NumberPrimeOrNot {

	public static void main(String[] args) {
		int n=6;
		boolean b= true;
		for(int i=2; i<n; i++){
			if(n%i==0){
				b=false;
			}
		}
		
		if(b==true){
			System.out.println("Number is prime number");
		}
		else{
			System.out.println("Number is not prime number");
		}

	}

}
