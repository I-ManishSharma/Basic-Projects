package operation;

import calculatorImplementation.Calculator;

public class Power {
	public static void pwr() {
		System.out.print("Enter the base: ");
		int base = Calculator.sc.nextInt();
		System.out.print("Enter the power: ");
		int pwr = Calculator.sc.nextInt();
		int i = 1, ans = 1;
		while (i <= pwr) {
			ans *= base;
			i++;
		}
		System.out.println("Output: " + ans);
	}
}
