package CodingInterview;

import java.util.ArrayList;

public class SortingArray {
//Sorting an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 4, 1, 9, 10, 3, 2, 1, 0 };
		int temp;
		ArrayList<Integer> c = new ArrayList<Integer>();
		for (int k = 0; k < a.length; k++) {

			for (int i = k + 1; i < a.length; i++) {
				if (a[k] > a[i]) {
					temp = a[k];
					a[k] = a[i];
					a[i] = temp;

				}
			}
			c.add(a[k]);
		}
		System.out.println(c); // Print the sorted number in array itself

		// Print just the number in order
		// for (int i = 0; i < a.length; i++) {
		// System.out.println(a[i]);
		// }

	}

}
