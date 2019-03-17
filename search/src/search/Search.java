package search;

import java.util.stream.IntStream;

//Binary search algorithm
public class Search {
	
	public static int BinarySearch(int k, int[] a) {
		int ret = -1;
		int l = 0;
		int r = a.length;
		while (l != r) {
			int m = (l + r) / 2;
			System.out.println("l = " +l +" r = " +r +" m = " + m);

			if (a[m] == k) {
				ret = m;
				break;
			} else if (a[m] > k) {
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		if (a[l]==k)
			ret = l;
		
		return ret;
		
	}
	

	public static void main(String[] args) {
		int[] a = {1, 3, 5, 7, 9, 11, 22, 38, 44, 52};
		IntStream.range(0, a.length).forEach(System.out::print);
		System.out.println('\n');

		System.out.println(BinarySearch(9, a));
		System.out.println('\n');
		
		System.out.println(BinarySearch(38, a));

	}

}
