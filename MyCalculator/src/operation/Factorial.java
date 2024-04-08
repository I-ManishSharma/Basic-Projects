package operation;

import calculatorImplementation.Calculator;

public class Factorial {
	public static void factorial() {
		System.out.print("Enter the number: ");
		int num = Calculator.sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= num ; i++) {
			factorial *= i;
		}		
		System.out.println("Output: " + factorial);
	}
}