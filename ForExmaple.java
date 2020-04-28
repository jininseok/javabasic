
public class ForExmaple {
    public static void main(String[] args) {
        int sum = 0;
        sum = sum + 1; // 1
        sum = sum + 2; // 3
        sum = sum + 3; // 6
        sum = sum + 4; // 10
        sum = sum + 5; // 15
        sum = 0;
        for (int i=1; i<=5; i++) {
            sum = sum + i;
            System.out.println(sum + ", " + i);
        }
        
        System.out.println("sum: " + sum);
        
        System.out.println(2+ " * " + 1 + " = " + (2 * 1));
        System.out.println(2+ " * " + 2 + " = " + (2 * 2));
        System.out.println(2+ " * " + 3 + " = " + (2 * 3));

        int var1 = 6;
        for (int i=1; i<=9; i++) {
            // i=1 ~9; i는 하나씩 증가한다.

            System.out.println(var1+ " * " + i + " = " + (var1 * i));
 


        }

    
    }


}