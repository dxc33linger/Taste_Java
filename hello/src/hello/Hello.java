package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		// Lec 3: print
		System.out.println("Hello Amy");
		System.out.println(24+43);
		System.out.println(6%(-3));
		
		// Lec 4: read from user
		Scanner in = new Scanner(System.in);
		System.out.println("what is in: "+in);
		System.out.print("Plz enter sth:");
		System.out.println("You entered "+in.nextLine());
		
		//Lec 5: link string 
		System.out.println("Hello"+" world.");
		System.out.println("Hello"+2);
		System.out.println("Hello"+2+3);
		System.out.println(2+3+"Hello");
	}

}
