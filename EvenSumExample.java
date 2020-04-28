
public class EvenSumExample {
    public static void main(String[] args) {

        //1~100까지 짝수만의 합.
        
        //int sum = 0;

        //for(int i = 1; i <= 100; i++) {
           // if (i % 2 == 1){
                //continue;
            //}
            //sum= sum + i;
        
       // }

        //System.out.println("짝수의 합계: " + sum);


        for(int i=1; i <= 100; i++) {
            // 2 또는 3의배수를 출력하세요. 조건합 : 조건A || 조건 B
            if((i % 2 ==00) || (i % 3 == 00) || (i % 5 == 0)) {
                System.out.println("2또는 3의 배수"+i);
            }

            if ((i % 2 ==0) && (i % 3 ==0) && (i % 5 == 0)); {
                System.out.println("2와 3의 배수"+ i);
            }

        }

    }
}