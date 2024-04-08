package previousTransaction;

import bankImplementation.Bank;

public class PrevTrans {
	public static void getPreviousTrans(){
		
		System.out.println("---------------------------------------");
        if(Bank.prevTrans>0){
            System.out.println("Deposited: "+Bank.prevTrans);
        }
        else if(Bank.prevTrans<0){
            System.out.println("Withdrawn: "+Math.abs(Bank.prevTrans));
        }
        else{
            System.out.println("No transaction occured");
        }
        System.out.println("---------------------------------------");
        
    }
}
