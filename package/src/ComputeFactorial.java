import java.util.Scanner;

public class ComputeFactorial {


	public static void main(String[] args) {
		System.out.println("ENTER binary number: ");
		Scanner in = new Scanner(System.in);
		String s =in.nextLine();
		
		// java.lang.Integer
		// Convert decimal to binary use Integer package
		Integer i = Integer.valueOf(s,2);
		int ii = i;
		System.out.println(ii);
		
		// Use java.lang.Character package
		System.out.println("ENTER characters: ");
		String ss =in.nextLine();

		char ch = ss.charAt(0);//return the character at index=0
		if(Character.isLowerCase(ch))
		{
		
			ch = Character.toUpperCase(ch);
			System.out.println(ch);			
		}
		// java.lang.String
		System.out.println("ENTER hello: ");

		String s1 = in.next();
		String s2 = "hello";
		System.out.println(s1==s2);
		System.out.println(s1.contentEquals(s2));

		String s3 = "hel"+"lo";
		System.out.println(s3==s2);
		System.out.println(s3.contentEquals(s2));
	}

}
