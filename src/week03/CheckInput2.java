package week03;

import java.util.Scanner;
public class CheckInput2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int month;
		do {
			System.out.print("올바른 월을 입력하시오 [1-12]: ");
			month = input.nextInt();
		}while(month < 1 || month >12); //조건
		System.out.println("사용자가 입력한 월은 " + month + "월 입니다.");
	}


}
