package CodingInterview;

public class AdjacentArray {
// Max difference between any adjacent index in an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 5, 8, 19, 20, 3, 5, 26 };
		int i, diff = 0;
		for (i = 0; i < a.length - 1; i++) {
			if ((a[i + 1] - a[i]) > diff) {
				diff = a[i + 1] - a[i];
			}

		}
		System.out.println(diff);
	}

}
