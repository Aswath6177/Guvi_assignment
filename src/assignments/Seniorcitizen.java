package assignments;
import java.util.Scanner;

public class Seniorcitizen {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age:");
		int a = scanner.nextInt();
		if (a>=60)
		{
			System.out.println("You are a senior citizen");
		}
		else 
		{
			System.out.println("you are not a senior citizen ");
		}
		
	}

}
