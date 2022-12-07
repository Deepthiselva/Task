package Task;

public class Factorial {

	public static void main(String[] args) {
		int n=6;
		
		//initialization
		int factorial = 1;
		int i = 1;
		
		while(i<=n) {
			factorial = factorial*i;
			i++;
		}
		
		System.out.println("Factorial of "+n+" is : "+factorial);
	}

}