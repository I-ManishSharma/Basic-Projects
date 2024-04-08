package operation;

import calculatorImplementation.Calculator;

public class Cube {
	public void cube() {
		System.out.print("Enter the number: ");
		int num = Calculator.sc.nextInt();
		int i = 1, ans = 1;
		while (i <= 3) {
			ans *= num;
			i++;
		}
		System.out.println("Output: " + ans);
	}
}
