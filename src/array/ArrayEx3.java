package array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;


        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

        }
        double average = (double) sum / arr.length;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);

    }
}
