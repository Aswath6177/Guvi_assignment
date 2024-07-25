package assignments;
import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scanner.nextInt();
		if (a%2==1)
		{
			System.out.println("The given number is a prime number ");
		}
		else 
		{
			System.out.println("The given number is not a prime number ");
		}
		
		
	}

}
