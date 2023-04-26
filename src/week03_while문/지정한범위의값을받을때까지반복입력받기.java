package week03_while문;

import java.util.Scanner;
public class 지정한범위의값을받을때까지반복입력받기 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int month;
		do {
			System.out.print("올바른 월을 입력하시오 [1-12]: ");
			month = input.nextInt();
		}while(month < 1 || month >12); //OR조건
		System.out.println("사용자가 입력한 월은 " + month + "월 입니다.");
	}


}
