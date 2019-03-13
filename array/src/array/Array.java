package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) 
	{
		int[] a = new int[(int)(Math.random()*100)];
		System.out.println(a.length);
		double[] b = new double[(int)(Math.random()*100)];
		System.out.println(b.length);		

		int[] a1 = new int[9];
		for(int i =0; i<a1.length; i++)
			a1[i] = (int)(Math.random()*100);
		// for-each
		for (int value:a1)
			System.out.println(value);
		
		
		
	}

}
