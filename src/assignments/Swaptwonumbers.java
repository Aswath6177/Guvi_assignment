package assignments;
import java.util.Scanner; 


public class Swaptwonumbers {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 1st number");
		int z;
		int a = scanner.nextInt();
		
		System.out.println("enter 2nd number");
		int b = scanner.nextInt();
		z=a;
		a=b;
		b=z;
		 System.out.println("First number: " + a);
	        System.out.println("Second number: " + b);
	
		
		
		
	}

}
