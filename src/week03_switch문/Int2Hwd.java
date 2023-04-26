package week03_switch문;

import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		
		System.out.print("1~5 숫자를 입력하시오: ");
		a = input.nextInt();
		// break문이 없다면 밑에 문장이 이어서 실행이됌
		switch(a){
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
			case 4:
				System.out.println("넷");
			case 5:
				System.out.println("다섯");
		}
	}

}
