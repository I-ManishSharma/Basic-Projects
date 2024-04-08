package operation;

import calculatorImplementation.Calculator;

public class Factor {
	public static void factor() {
		System.out.print("Enter the number: ");
		int num = Calculator.sc.nextInt();
		System.out.println("Output: ");
		for (int i = 1; i <= num ; i++) {
			if (num % i == 0) System.out.print(i + " ");			
		}
		System.out.println();
	}
}
