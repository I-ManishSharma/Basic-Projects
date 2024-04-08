package additionProg;

import calculatorImplementation.Calculator;

public class Addition {
	
	public static void add() {
		
		System.out.print("Enter the first number: ");
		int a = Calculator.sc.nextInt();
		System.out.print("Enter the Second number: ");
		int b = Calculator.sc.nextInt();
		System.out.println("Output: " + (a+b));
		
	}
}
