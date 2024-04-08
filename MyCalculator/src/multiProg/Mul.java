package multiProg;

import calculatorImplementation.Calculator;

public class Mul {
	
	public static void multi() {
		
		System.out.print("Enter the first number: ");
		int a = Calculator.sc.nextInt();
		System.out.print("Enter the Second number: ");
		int b = Calculator.sc.nextInt();
		System.out.println("Output: " + (a*b));
		
	}
}