package Com.Test;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean isPrime = isPrime(5);
		if(isPrime){
			System.out.println("Prime");
		}
		else{
			System.out.println("not prime");
		}

	}
	
	public static boolean isPrime(int number){
		if (number<=1){
			return false;
		}
		
		else{
			for (int i=2; i<Math.sqrt(number); i++){
				if(number %i ==0){
					return false;
				}
			}
		}
		
		return true;
		
		
		
		
	}

}
