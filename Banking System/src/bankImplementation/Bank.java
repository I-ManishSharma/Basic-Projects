package bankImplementation;

import java.util.Scanner;
import createAccount.CreateAccount;
import login.Login;

public class Bank {
	
	public static double bal;
    public static double prevTrans;
    public static long account_number = 2345678910l;
    
    public static Scanner sc = new Scanner(System.in);
    public static StringBuilder user = new StringBuilder();
    public static StringBuilder account = new StringBuilder();
    
	public static void main(String[] args) {
		
		System.out.println("Welcome to Do Din me Paisa Double Bank");
		System.out.println("---------------------------------------");
		
		boolean flag = true;
		while (flag) {
			
			System.out.println("Enter 1 for login");
			System.out.println("Enter 2 to create a Account");
			System.out.println("Enter 3 to exit");
			System.out.println("---------------------------------------");
			System.out.print("Enter your choice: ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				Login.login();
				break;
			case 2:
				CreateAccount.createAccount();
				break;
			case 3:
				flag = false;
				System.out.println("-------------------------------------------------------");
				System.out.println("Thankyou for using our bank services. CEO Manish Sharma");
				System.out.println("-------------------------------------------------------");
				break;
			default:
				System.out.println("---------------------------------------");
				System.out.println("Invalid choice");
				System.out.println("---------------------------------------");
			}
		}
		System.out.println("For more projects check github: I-ManishSharma");
		sc.close();
	}
}