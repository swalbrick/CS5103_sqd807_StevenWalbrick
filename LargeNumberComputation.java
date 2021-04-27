import java.text.NumberFormat;
import java.util.Scanner;
 
public class LargeNumberComputation
{
    public static void main(String args[])
  {
    	
 //First Requirement: Perform addition and subtraction of two numbers. 	
    	
    double first, second, third, add, subtract;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter The Two Numbers: ");
    first = scanner.nextDouble();
    second = scanner.nextDouble();
    
    System.out.println("   ");
    System.out.println("The Numbers You Entered Aligned:");
    System.out.println(String.format("%8.3f", first));
    System.out.println(String.format("%8.3f", second));

    add = first + second;
    subtract = first - second;

    System.out.println("   ");
    System.out.println("The Numbers Added and Subtracted:");
    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    
 //Second Requirement: Add an output feature to convert the large number to a string. 
 //The string needs to have comma between every three digits from the end.   

    System.out.println(" ");
    System.out.println("Enter A Large Number: ");
    third = scanner.nextDouble();
    
    String str1= NumberFormat.getInstance().format(third); 
    
    System.out.println("The Large Number Formatted: " + str1);
    
  }
}