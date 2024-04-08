package operation;

import calculatorImplementation.Calculator;

public class Sqr {
	public static void sqr() {
		System.out.print("Enter the number: ");
		int num = Calculator.sc.nextInt();
		System.out.println("Output: " + (num*num));
	}
}
