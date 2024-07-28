package assignments;
import java.util.Scanner;

public class NumberofDigits {
public static void main (String[] args )
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number:");
	int number=scanner.nextInt();
	
	  int count = 0;
	    while (number > 0) {
	        number /= 10;
	        count++;
	    
	    }		
	    System.out.println("The number of digits:" +count);
}
}
