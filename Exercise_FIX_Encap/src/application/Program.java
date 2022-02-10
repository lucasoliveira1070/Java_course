package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;

		System.out.println("Enter account number: ");
		int numAccount = sc.nextInt();
		System.out.println();

		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println();

		System.out.println("Is there an initial deposit (y/n)?");
		char answer = sc.next().charAt(0);

		if (answer == 'y' || answer == 'Y') {
			System.out.println("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			acc = new Account(numAccount, holder,deposit);

		} else {
			acc = new Account(numAccount,holder);
			
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(acc);
		
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		acc.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		
		sc.close();

	}

}
