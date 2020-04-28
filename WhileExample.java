
public class WhileExample {
    public static void main(String[] args) {
        int sum= 0;
        for (int i=1; i<= 5; i++) {
            sum = sum + 1;

    }

    //while 사용.
    int i = 1;
    sum = 0;
    while (i <= 5) {
        sum = sum + 1;
        i++;
    }
    System.out.println("sum1 :" + sum);

    //while ...
    i = 1;
    while(true) {
        //참일때만 출력한다.
        sum = sum + i;
        if (i > 5){
            break;
        }
        sum = sum +1;
        i++;
    }
    System.out.println("sum2 :" + sum);


 while (i<=100) {
     sum = sum +1;
     if (i % 2 == 1) {
     }
     sum = sum +1;
     i++;
    }
    System.out.println("sum3: " + sum);

}
}