package ticketmachine;

import java.util.Scanner;

public class TicketMachine2 {
	// field, member variable, instance variable
	private int price;
	private int balance;
	private String name = "";

	// Constructor:
	public TicketMachine2(int i) {
		price = i;
	} // Constructor Overload: same function name with different variable

	public TicketMachine2(String name) {
		this.name = name;
	} // Constructor Overload: same function name with different variable

	public TicketMachine2(int price, String name) {
		this(name); // constructor caller, this line calls line17 "this.name = name;"
		this.price = price;// first "price" is member variable, 
						   //second price is local variable
	}

	// Methods
	public void showPrompt() {
		System.out.println("Welcome to ticket " + name);
		System.out.println("The price is: " + price);
	}

	public void insertMoney(int bill) {
		balance += bill;
		System.out.println("Received " + bill);
		printBalance();
	}

	public boolean isEnough() {

		return balance >= price;
	}

	public void printTicket() {
		//newBalance is "local variable"
		//balance is "member variable"
		int newBalance = balance - price;
		System.out.println("Tickek is coming....");
		System.out.println("Change: " + newBalance);
		balance = 0;
		printBalance();
	}

	public void printBalance() {
		System.out.println("Balance: " + balance);
	}

	public static void main(String[] args) {

		int bill;
		TicketMachine2 tm4 = new TicketMachine2(70, "blue");
		tm4.showPrompt();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter bill...");

		do {
			bill = in.nextInt();
			tm4.insertMoney(bill);
			if (tm4.isEnough()) {
				tm4.printTicket();
				break;
			}
		} while (true);
	}

}
