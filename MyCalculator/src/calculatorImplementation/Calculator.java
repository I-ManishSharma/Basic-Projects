package calculatorImplementation;

import java.util.Scanner;

import additionProg.*;
import subProg.*;
import multiProg.*;
import otherOperations.Operation;
import divProg.*;

public class Calculator {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to my Calculator");
		
		boolean flag = true;
		while (flag) {
			
			System.out.println("Enter the option");
			System.out.println("1. for addition");
			System.out.println("2. for sub");
			System.out.println("3. for multiply");
			System.out.println("4. for division");
			System.out.println("5. for other operation");
			System.out.println("6. for exit");
			
			int option = sc.nextInt();
			
			switch (option) {
			case 1:
				Addition.add();
			break;
			case 2: 
				Sub s = new Sub();
				s.sub();
			break;
			case 3:
				Mul.multi();
			break;
			case 4: 
				Div.div();
			break;
			case 5: 
				Operation.operations();
			break;
			case 6:
				flag = false;
			break;
			default:
				System.out.println("Enter the correct option");
			}
		}
		
		System.out.println("Thankyou for using my calculator");
		System.out.println("For more programs contact at github: I-ManishSharma");
		sc.close();
		
	}
}