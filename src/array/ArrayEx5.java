package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] student = new int[4][3];

        for ()
        for (int num = 1; num < 5; num++) {
            System.out.println(num + "번 학생의 성적을 입력하세요 :");
            System.out.print("국어 점수:");
            int korean = sc.nextInt();
            System.out.print("영어 점수:");
            int english = sc.nextInt();
            System.out.print("수학 점수:");
            int math = sc.nextInt();
            total = korean + english + math;
            avg = total / 3;

        }

        for (int num = 1; num < 5; num++) {
            System.out.println(num + "번 학생의 총점: " + total + "평균: " + avg);
        }




    }
}
