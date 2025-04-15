package activity;

import java.util.Scanner;

abstract class Bank{
	abstract void deposit();
	abstract void withdraw();
}

public class BankAccount extends Bank {

	public static void main(String [] args) {
		BankAccount b = new BankAccount();
		 Scanner scan = new Scanner(System.in);
		 System.out.println("1 - Deposit \n2 - Withdraw\n");
		 int i = scan.nextInt();
		 switch (i) {
		 	case 1: 
		 		b.deposit();
				break;
			case 2: 
				b.withdraw();
				break;
		 }
		 scan.close();
	}
	
	
	@Override void deposit() {
		System.out.println("DEPOSIT");
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter Amount: ");
		 double amount = s.nextDouble();
		 System.out.print("You have successfully deposited P" + amount);
		 s.close();
		
	}
	

	@Override void withdraw() {
		System.out.println("WITHDRAW");
		Scanner s = new Scanner(System.in);
		 System.out.print("Enter Amount: ");
		 double amount = s.nextDouble();
		 System.out.print("You have successfully withdrawed P" + amount);
		 s.close();
	}
}
