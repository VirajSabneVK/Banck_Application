package Application;

import java.util.Scanner;

/*
 * created By @VirajVs
 * This class is perform bank application operation
 * and perform deposit ,withdraw, previousTransaction operations 
  */
public class BanckAccount {

	// Created Instance Variables
	int balance;
	int previousTransaction;

	/*
	 * Create deposit() method using if statement and perform addition operation
	 * balance + amount
	 */

	void deposite(int amount) {

		// Perform deposit operation balance + amount
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = balance;
		}
	}

	// create Withdraw() method and perform withdraw operation
	// using if statement

	void withdraw(int amount) {
		// perform withdraw balance - amount
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	/*
	 * perform Transition operation print massage deposit some amount Or withdraw
	 * some amount using if statement perform deposit & withdraw operation using
	 * math.absalute class
	 */

	public void getpreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited : " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdraw : " + Math.abs(previousTransaction));
		} else {
			System.out.println("****No tranzaction occured****");
		}
	}

	// display menu for User

	public void showMenu() {

		// It is initialize char value with 0 index
		char option = '\0';

		// Give input form user
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Name :");
		String name = scanner.nextLine();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome : " + name.toUpperCase());
		System.out.println("Enter Your Id :");
		int customerid = scanner.nextInt();
		System.out.println("Welcome To Our Banck");
		System.out.println("Your Name Is  : " + name);
		System.out.println("Your Id Is : " + customerid);

		System.out.println("A. CheckBalance");
		System.out.println("B. Withdraw");
		System.out.println("C. Diposit");
		System.out.println("D.previousTransaction");
		System.out.println("E.Exit");

		do {

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~`");
			System.out.println("Enter An Ooption : ");
			option = scanner.next().charAt(0);
			// System.out.println("\n");

			switch (option) {

			case 'A':
				System.out.println("<<<<<<<<<<<<<<<<<<<<<");
				System.out.println("Balance =" + balance);
				System.out.println(">>>>>>>>>>>>>>>>>>>>>");
				break;

			case 'C':
				System.out.println("<<<<<<<<<<<<<<<<<<<<<");
				System.out.println("Enter Amount To Deposit");
				System.out.println(">>>>>>>>>>>>>>>>>>>>>");
				// pass value form amount Variable and store deposit method
				int amount = scanner.nextInt();
				deposite(amount);
				System.out.println("\n");
				break;

			case 'B':
				System.out.println("<<<<<<<<<<<<<<<<<<<<<");
				System.out.println("Enter Amount Of Withdraw : ");
				System.out.println(">>>>>>>>>>>>>>>>>>>>>");
				// pass value form amount Variable and store withdraw method
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;

			case 'D':
				System.out.println("<<<<<<<<<<<<<<<<<<<<");
				getpreviousTransaction();
				System.out.println("<<<<<<<<<<<<<<<<<<<<");
				System.out.println("\n");

			case 'E':
				System.out.println("THANKU : " + name);
				break;

			default:
				System.out.println("Invalid Option !! please  enter again");
				break;
			}
		} while (option != 'E');
		System.out.println("Thanku for using our services");
	}

}
