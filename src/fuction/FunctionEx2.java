package fuction;

public class FunctionEx2 {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;

        while (count < 10) { //짝수 개수. 짝수를 몇개 출력할건지
            if (num % 2 == 0) {
                System.out.println(num);
                count++; //짝수 카운트
            }
            num++; //다음 숫자로 이동

        }


//        for (int num = 1, count = 0; count < 10; num++) {
//            if (num % 2 == 0) {
//                System.out.println(num);
//                count++;

            }
        }



