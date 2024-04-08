package createAccount;

import bankImplementation.Bank;

public class CreateAccount {
	public static void createAccount() {
		System.out.println("-----------------------------------");
		System.out.print("Enter your name: ");
		Bank.sc.nextLine();
		String name = Bank.sc.nextLine();
		Bank.user.append(name);
		Bank.account.append(++Bank.account_number);
		System.out.println("Account created Successfully.");
		System.out.println("Name of costumer: "+name);
		System.out.println("Account Number: "+ Bank.account_number);
		System.out.println("----------------------------------------");
	}
}
