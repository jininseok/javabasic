
public class ForSumExample {
    public static void main(String[] args) {
        //1..100 까지 합을 구하는 프로그램.
        // 3의 배수만 구하는 프로그램.

        int sum = 0;

        for(int i=0; i<=100; i++) {
            if (i % 3 == 0) {
                // % : 몫 구하는거.
            sum += 1;
            }

        }

        System.out.println("1~100 합 3의배수: " + sum);
    }
}