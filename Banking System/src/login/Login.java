package login;

import bankImplementation.Bank;
import deposit.Deposit;
import previousTransaction.PrevTrans;
import withdrawal.Withdrawal;

public class Login {
	
	public static void login() {
		
		System.out.println("---------------------------------------");
		System.out.print("Enter the customer name: ");
		Bank.sc.nextLine();
		String cus_name = Bank.sc.nextLine();
		System.out.print("Enter the customer Account number: ");
		String acc_number = Bank.sc.nextLine();
		
		if (Bank.user.toString().contains(cus_name) && Bank.account.toString().contains(acc_number)) {
			System.out.println("---------------------------------------");
			System.out.println("login Successfull");
			System.out.println("---------------------------------------");
			boolean flg = true;
			while (flg) {
				System.out.println("Enter 1 to check balance");
				System.out.println("Enter 2 to deposit money");
				System.out.println("Enter 3 to withdrawal money");
				System.out.println("Enter 4 to check previous transaction");
				System.out.println("Enter 5 to logout");
				System.out.println("---------------------------------------");
				System.out.print("Enter your choice: ");
				
				int choice1 = Bank.sc.nextInt();
				
				switch (choice1) {
				case 1:
					System.out.println("---------------------------------------");
					System.out.println("Your Account Balance is: "+ Bank.bal);
					System.out.println("---------------------------------------");
					break;
				case 2:
					Deposit.deposit();
					break;
				case 3:
					Withdrawal.withdrawal();
					break;
				case 4:
					PrevTrans.getPreviousTrans();
					break;
				case 5:
					flg = false;
					System.out.println("---------------------------------------");
					System.out.println("Logout Successfully");
					break;
				default:
					System.out.println("---------------------------------------");
					System.out.println("Invalid choice");
					System.out.println("---------------------------------------");
				}
			}
		} else {
			System.out.println("User and Account number invalid");
			System.out.println("Please Enter the Currect details OR Create Account if not.");
		}
		System.out.println("-----------------------------------");
	}
}
