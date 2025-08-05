package scanner;

import java.util.Scanner;

public class ScannerEx7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
			int price = sc.nextInt();
//			String enter = sc.nextLine();
			
			if(price == -1) {
				System.out.print("프로그램을 종료합니다.");
				break;
			} else {
				System.out.print("구매하려는 수량을 입력하세요: ");
				int quantity = sc.nextInt();
				int total = price * quantity;
				System.out.println("총비용: " + total);
			}
			
		}
		
	}

}
