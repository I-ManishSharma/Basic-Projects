package otherOperations;

import calculatorImplementation.Calculator;
import operation.*;

public class Operation {
	
	public static void operations() {
		
		boolean flg = true;
		while (flg) {
			
			System.out.println("1. for count the digits of number");
			System.out.println("2. for sqr");
			System.out.println("3. for cube");
			System.out.println("4. for factorail");
			System.out.println("5. for factor");
			System.out.println("6. for power");
			System.out.println("7. for exit");
			
			int choice2 = Calculator.sc.nextInt();
			
			switch (choice2) {
			case 1:
				Count.count();
			break;
			case 2:
				Sqr.sqr();
			break;
			case 3:
				Cube c = new Cube();
				c.cube();
			break;
			case 4:
				Factorial.factorial();
			break;
			case 5:
				Factor.factor();
			break;
			case 6:
				Power.pwr();
			break;
			case 7:
				flg = false;
			break;
			default : 
				System.out.println("Enter the correct option");
			}
		}
	}
}
