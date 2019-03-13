package variable_create;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		// int
		Scanner in = new Scanner(System.in);
		
		int price = 0;
		System.out.println("Input price: ");
		price = in.nextInt();
		
		int bill = 100;
		System.out.print("Input bill: ");
		bill = in.nextInt();
		
		int change = bill - price;
		System.out.println(change);
		
		// double
		// convert foot+inch to meter
		int foot;
		int inch;
		System.out.println("Enter Foot: ");
		foot = in.nextInt();
		System.out.println("Enter Inch: ");
		inch = in.nextInt();
		double wrong_meter = (foot + inch/12)*0.3048;
		System.out.println("Wrong meter: "+wrong_meter+ ", as 12 shoud be 12.0");
		double meter = (foot + inch/12.0)*0.3048;
		System.out.println("Correct meter: "+meter);
		
		//floating point with error
		System.out.println("1.2-1.1="+ (1.2-1.1));
		
		// converting between types
//		long a = 10000000000; // error, since out of range
		long a = 10000000000L;
//		float e = 1.5; //error, since 1.5 default to be double
		float e =1.5F;
		double f = e;
		System.out.println("f="+f);
		
//		float meter = (foot + inch/12.0)*0.3048; // error, since floating number in default to be double
		float meter_f = (float) meter; //convert double to float
		System.out.println("meter_f="+meter_f);

	}

}
