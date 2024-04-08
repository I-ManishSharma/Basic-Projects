package divProg;

import calculatorImplementation.Calculator;

public class Div {
	public static void div() {
		
		System.out.print("Enter the first number: ");
		int a = Calculator.sc.nextInt();
		System.out.print("Enter the Second number: ");
		int b = Calculator.sc.nextInt();
		System.out.println("Output: " + (a/b));
		
	}
}
