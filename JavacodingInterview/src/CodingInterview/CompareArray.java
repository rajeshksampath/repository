package CodingInterview;

import java.util.ArrayList;

public class CompareArray {
//Compare same indexes of 2 different arrays and create another array from matching values
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 4, 5, 8, 10, 5, 7 };
		int[] b = { 1, 5, 4, 8, 10, 7, 7 };
		int i;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				list.add(a[i]);

			}
		}
		System.out.println(list);

		Object[] c = list.toArray();
		for (Object obj : c) {
			System.out.println(obj);
		}
	}

}
