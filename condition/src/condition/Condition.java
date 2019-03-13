package condition;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = in.nextInt();
		System.out.println("Enter y: ");
		int y = in.nextInt();
		int max = 0;
		if (x > y) {
			max = x;
		} else if (x == y) {
			System.out.println("x==y");
		} else {
			max = y;
		}
		System.out.println(max);
	}

}
