package scanner;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 수를 입력해주세요: ");

        int i = scanner.nextInt();
        System.out.println(i + "단의 구구단:");
        int result = 0;

        for (int j = 1; j <= 9; j++) {
            result = i * j;
            System.out.println(i + " * " + j + " = " + result);
        }
    }
}
