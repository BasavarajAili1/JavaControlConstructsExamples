package kodnestCalculator;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		Calculator calculator=new Calculator();
		while (true) 
		{
			System.out.println("HELLO USER!! WELCOME TO KODNEST CALCULATOR...");
			System.out.println("+  ---->  Addition");
			System.out.println("-  ---->  Subtraction");
			System.out.println("*  ---->  Multiplication");
			System.out.println("/  ---->  Division");
			System.out.println("%  ---->  Modulus");
			System.out.println("^  ---->  Square");
			System.out.println("!  ---->  To Stop");
			System.out.println("Enter your choice!!");
			char ch=scan.next().charAt(0);

			switch (ch) 
			{
			case '+':
				calculator.addition();
				break;
			case '-':
				calculator.subtraction();
				break;
			case '*':
				calculator.multiplication();
				break;
			case '/':
				calculator.division();
				break;
			case '%':
				calculator.remainder();
				break;
			case '^':
				calculator.square();
				break;
			case '!': System.out.println("Calculator is stopped..");
				return;
			default :
				System.out.println("See the message correctly and Enter valid choice onlyyy...");
			}

		}
		
	}

}
