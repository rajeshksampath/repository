package CodingInterview;

//Create a method which accepts array and return sum of all elements in array.

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = sumArray(a);
		System.out.println(sum);

	}

	public static int sumArray(int[] a) {
		// TODO Auto-generated method stub

		int sum = 0;
		int i;
		for (i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		return sum;
	}

}
