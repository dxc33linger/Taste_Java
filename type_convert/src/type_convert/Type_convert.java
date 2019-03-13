package type_convert;

public class Type_convert {

	public static void main(String[] args) {
		short s = 2;
		int s1 = s + 2; //short + int = int
		System.out.println(s1); 
		
		System.out.println(12L+12.0F); // long + float = float
		System.out.println("========================="); 

		//float f = 1.0 ; //error, 1.0 default to be double
		float f =1.0f;
		double f1 = 7.0 * f;
		System.out.println(f1); 
		System.out.println("========================="); 

		int i = (int)(32 / 3.0);
		System.out.println(i);
		System.out.println("========================="); 

		//rounding
		i = (int)(Math.round(-10.8));
		System.out.println(i);
		System.out.println("========================="); 

		// char to int
		char c = (char)65;
		int ii = (int)'A';
		System.out.println(c);
		System.out.println(ii);
		System.out.println("========================="); 

		//converting does not change the variable itself
		double b = 10.3;
		int a = (int)b;
		System.out.println("a= "+a + " b= " +b + " b does not change");
		System.out.println("========================="); 
	
		// a++ and ++a		
		a = 6;				
		System.out.println(a++); //a =7
		System.out.println(++a); //a = 8
		System.out.println(a);
		System.out.println("========================="); 
	
		//
		System.out.println("123\t456"); 
		System.out.println("12\t456"); 
		System.out.println("1\t456");
		
		System.out.println("123\b");
		System.out.println("123\b456");
		
		System.out.println("123\r456");

		}
	

}
