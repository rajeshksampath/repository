package CodingInterview;

import java.util.ArrayList;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c;
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(a);
		for (int i = 1; i < 10; i++) {
			c = a + b;
			a = b;
			b = c;
			//System.out.println(c); -> Just to print
			list.add(c); // Create array list and add it to array to print in array
			
		}
		System.out.println(list);
	}

}
