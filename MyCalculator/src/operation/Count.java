package operation;

import calculatorImplementation.Calculator;

public class Count {
	public static void count() {
		
		System.out.print("Enter the number: ");
		int num = Calculator.sc.nextInt();
		int ctr = 0;
		while (num > 0) {
			ctr++;
			num /= 10;
		}
		System.out.println("Output: " + ctr);
	}
}
