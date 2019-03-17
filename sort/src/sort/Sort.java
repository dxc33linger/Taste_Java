package sort;

import java.util.Arrays;

public class Sort {
	public static void SelectionSort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			int max_idx = 0;
			//optimization here: j start from 1, i stop at a.length-1
			for (int j = 1; j < a.length - i; j++) {
				if (a[j] > a[max_idx]) {
					max_idx = j;
				}
			}

			int t = a[max_idx];
			a[max_idx] = a[a.length - i - 1];
			a[a.length - i - 1] = t;
			System.out.println("iteration " + (i + 1) + " : a=" + Arrays.toString(a));
		}
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++)
			a[i] = (int) (Math.random() * 100);
		System.out.println("iteration 0" + " : a=" + Arrays.toString(a)+"\n");
		SelectionSort(a);
	}
}
