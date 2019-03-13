import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = in.nextInt();
		while(x>0) {
			x = (x/2);
			System.out.println(x);
		}
		
		//GCD - greatest common divisor
		Scanner in2 = new Scanner(System.in);
		System.out.print("Enter 2 int numbers: ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int dividend = (n1>n2)?n1:n2;
		int divisor = (n1>n2)?n2:n1;
		
		int remainder = divisor;
		
		while (remainder>0)
		{
			System.out.println("dividend:"+dividend +
					" divisor: "+divisor +
					" remainder: "+remainder);
			divisor = remainder;
			remainder = dividend % divisor;
			dividend = divisor;

		} 
		System.out.println(n1+ " and " + n2 + "'s greatest common divisor is " +divisor);
		
		
		
	}

}
