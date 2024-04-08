package withdrawal;

import bankImplementation.Bank;

public class Withdrawal {
	public static void withdrawal() {
		
		System.out.println("---------------------------------------");
		System.out.print("Enter the amount to be withdrawal: ");
		int amt = Bank.sc.nextInt();
		if(amt!=0 && Bank.bal>=amt){
            Bank.bal-=amt;
            Bank.prevTrans=-amt;
            System.out.println(amt+" Withdrawal successfully");
        }
        else if(Bank.bal<amt){
            System.out.println("Bank balance insufficient");
        }
		System.out.println("---------------------------------------");
		
	}
}
