package CodingInterview;

public class SwappingIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Swaping without Temp
		int a = 4;
		int b = 5;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

		/// Swapping with temp variable
		int d = 10;
		int e = 7;
		int temp;
		temp = d;
		d = e;
		e = temp;
		System.out.println(d);
		System.out.println(e);
	}

}
