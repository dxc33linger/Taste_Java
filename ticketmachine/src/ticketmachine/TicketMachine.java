package ticketmachine;

import java.util.Scanner;

public class TicketMachine {
	private int price = 80;
	private int balance;
	
	public void showPrompt() {
		System.out.println("Welcome to ticket ");
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
		System.out.println("Tickek is coming....");
		System.out.println("Change: " + (balance - price));
		balance = 0;	 	
		printBalance();
	}		


	public void printBalance() {
		System.out.println("Balance: " + balance);
	}

	public static void main(String[] args) {
		TicketMachine tm = new TicketMachine();
		tm.showPrompt();
		tm.insertMoney(100);
		tm.isEnough();
		System.out.println("\n");
		
		TicketMachine tm2 = new TicketMachine();
		tm2.price = 60;
		tm2.showPrompt();
		tm2.insertMoney(70);
		tm2.isEnough();
		tm2.insertMoney(10);
		tm2.isEnough();
		
		System.out.println("\n");
		// auto detect bill
		int bill;
		TicketMachine tm3 = new TicketMachine();
		tm3.showPrompt();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter bill...");

		do {
			bill = in.nextInt();
			tm3.insertMoney(bill);
			if(tm3.isEnough()) {
				tm3.printTicket();
				break;
			}
		}while(true);
	}
		
	
	
				
		
}
