public class WrapperDemo {

	public static void main(String[] args) {

		int i = 5;
		Integer ii = new Integer(i); // ii is a reference. This line is the same as above. Integer is a wrapper
										// class. Boxing/wrapping.

		int j = ii.intValue(); // returns 5. Unboxing/unwrapping.

		Integer value = i; // Autoboxing/autowrapping

		int k = value; // Autounboxing. Does ii.intValue()

		String str = "123";

		int number = Integer.parseInt(str); // Gives 123
		System.out.println(number);

	}

}
