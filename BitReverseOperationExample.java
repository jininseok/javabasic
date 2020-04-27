
public class BitReverseOperationExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = ~num1;
		int num3 = num2 + 1;
		System.out.println(num3);

<<<<<<< HEAD
		System.out.println("Hello, World");

		// java conflict..
		// java2 add.....
=======
		// java conflict
>>>>>>> 68689edf276f78aaca01da044195ec726dc81a68

		String returnValue = toBinaryString(num1);
		System.out.println(returnValue);

		String returnValue1 = toBinaryString(num2);
		System.out.println(returnValue1);

		String returnValue2 = toBinaryString(num3);
		System.out.println(returnValue2);
	}

	public static String toBinaryString(int val) {
		String str = Integer.toBinaryString(val);
		while (str.length() < 32) {
			str = "0" + str;
		}
		return str;

	}
}

