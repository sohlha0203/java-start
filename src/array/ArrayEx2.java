package array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i=0; i<arr.length;i++) {
            arr[i] = sc.nextInt(); //제발 주의.
        }

        System.out.println("출력");

        for (int i = 0; i < arr.length; i++) {
//            if (i == 4) {
//                System.out.print(arr[i]);
//
//            } else {
//                System.out.print(arr[i]);
//                System.out.print(", ");
//            }

            if (i<arr.length -1) { //arr.length는 5, arr.length - 1은 4, 마지막 index 즉 i = 4 전까지 콤마 필요. 따라서 i < arr.length - 1
                System.out.print(", ");

            }
        }
    }
        }


