package assignments;
import java.util.Scanner;

public class Factorial {
	static  public void main(String[] args)
	
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to be factorial");
	    int a=scanner.nextInt();
	    long factorial = 1;
	    for (int i=1;i<=a;i++)
	    {
	    	factorial*=i;
	    }
	    System.out.println("factorial of number is :" +factorial);
	    
	}

}
