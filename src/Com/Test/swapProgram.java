package Com.Test;
// swap program with temp variable
public class swapProgram {

	public static void main(String[] args) {
		int i= 4;
		int j= 3;
		System.out.println(i + "    "+ j);
		int temp= i;
		i=j;
		j=temp;
		System.out.println(i + "    "+ j);

	}

}
