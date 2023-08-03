package kodnestCalculator;
import java.util.Scanner;

public class Calculator {
	Scanner scan=new Scanner(System.in);

	void addition()
	{
		System.out.println("Enter two numbers:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Addition of "+a+" with "+b+" is: "+(a+b));
	}
	void subtraction()
	{
		System.out.println("Enter two numbers: ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
	}
	void multiplication()
	{
		System.out.println("Enter two numbers:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
	}
	void division()
	{
		System.out.println("Enter two numbers:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Division of "+a+" by "+b+" is:"+(a/b));
	}
	void remainder()
	{
		System.out.println("Enter two numbers:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Remainder when "+a+" is divided by "+b+" is:"+(a%b));
	}
	void square()
	{
		System.out.println("Enter a number:");
		int a=scan.nextInt();
		System.out.println("Square of "+a+" is "+(a*a));
	}
}
