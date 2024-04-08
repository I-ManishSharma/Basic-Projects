package deposit;

import bankImplementation.Bank;

public class Deposit {
	public static void deposit() {
		
		System.out.println("---------------------------------------");
		System.out.print("Enter the amount to be deposit: ");
		double amount = Bank.sc.nextDouble();
		Bank.bal += amount;
		Bank.prevTrans=amount;
		System.out.println(amount+" deposit successfully");
		System.out.println("---------------------------------------");
		
	}
}
