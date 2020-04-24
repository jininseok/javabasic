
public class BooleanExample {
	public static void main (String[] args) {
		boolean isTrue = false; // true
		isTrue = true;
		
		int num1, num2;
		num1 = 29;
		num2 = 19;
		
		isTrue = num1 > num2;
		
		if (isTrue) {
			System.out.println("num1 is larger than num2");
		}
				
		else {
			System.out.println("num2 is	larger than num1");
		}
		
	}
}