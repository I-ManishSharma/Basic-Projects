package calculatorImplementation;

import java.util.Scanner;

import additionProg.*;
import subProg.*;
import multiProg.*;
import divProg.*;
import operation.*;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to my Program");
		
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
			case 1: {
				System.out.print("Enter the first number: ");
				int a = sc.nextInt();
				System.out.print("Enter the Second number: ");
				int b = sc.nextInt();
				int ans = Addition.add(a,b);
				System.out.println("Output: " + ans);
			}
			break;
			case 2: {
				System.out.print("Enter the first number: ");
				int a = sc.nextInt();
				System.out.print("Enter the Second number: ");
				int b = sc.nextInt();
				Sub s = new Sub();
				int ans = s.sub(a,b);
				System.out.println("Output: " + ans);
			}
			break;
			case 3: {
				System.out.print("Enter the first number: ");
				int a = sc.nextInt();
				System.out.print("Enter the Second number: ");
				int b = sc.nextInt();
				int ans = Mul.multi(a,b);
				System.out.println("Output: " + ans);
			}
			break;
			case 4: {
				System.out.print("Enter the first number: ");
				int a = sc.nextInt();
				System.out.print("Enter the Second number: ");
				int b = sc.nextInt();
				int ans = Div.div(a,b);
				System.out.println("Output: " + ans);
			}
			break;
			case 5: {
				boolean flg = true;
				while (flg) {
					System.out.println("1. for count the digits of number");
					System.out.println("2. for sqr");
					System.out.println("3. for cube");
					System.out.println("4. for factorail");
					System.out.println("5. for factor");
					System.out.println("6. for power");
					System.out.println("7. for exit");
					int choice2 = sc.nextInt();
					switch (choice2) {
					case 1: {
						System.out.print("Enter the number: ");
						int a = sc.nextInt();
						int ans = Count.count(a);
						System.out.println("Output: " + ans);
					}
					break;
					case 2: {
						System.out.print("Enter the number: ");
						int a = sc.nextInt();
						int ans = Sqr.sqr(a);
						System.out.println("Output: " + ans);
					}
					break;
					case 3: {
						System.out.print("Enter the number: ");
						int a = sc.nextInt();
						Cube c = new Cube();
						int ans = c.cube(a);
						System.out.println("Output: " + ans);
					}
					break;
					case 4: {
						System.out.print("Enter the number: ");
						int a = sc.nextInt();
						int ans = Factorial.factorial(a);
						System.out.println("Output: " + ans);
					}
					break;
					case 5: {
						System.out.print("Enter the number: ");
						int a = sc.nextInt();
						System.out.println("Output: ");
						Factor.factor(a);
					}
					break;
					case 6: {
						System.out.print("Enter the base: ");
						int a = sc.nextInt();
						System.out.print("Enter the power: ");
						int b = sc.nextInt();
						int ans = Power.pwr(a,b);
						System.out.println("Output: " + ans);
					}
					break;
					case 7: {
						flg = false;
					}
					break;
					default : {
						System.out.println("Enter the correct option");
					}
					}
				}
			}
			break;
			case 6: {
				flag = false;
			}
			break;
			default:
				System.out.println("Enter the correct option");
			}
		}
		System.out.println("Thankyou");
		System.out.println("For more programs contact at github: I-ManishSharma");
		sc.close();
	}
}