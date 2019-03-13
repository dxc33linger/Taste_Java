package methods;

public class Methods {
	public static int cal(int a, int b)
	{
		int i;
		int sum = 0;
		for (i=a; i<=b; i++) {
			sum += i;
		}
		System.out.println(sum);
		return sum;

	}
	
	public static void swap(int a, int b) { //callee
		int temp;
		temp = a;
		a = b;
		b = temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal(1,10);
		cal(20,30);
		cal(30, 40);
		System.out.println("sum from 30 to 40 is "+cal(30,40));
		
		int a = 1;
		int b = 2;
		swap(a,b); //caller
		System.out.println("a is still"+ a); 
		//a is still 1. Since callee cannot modify caller.
	}

}
