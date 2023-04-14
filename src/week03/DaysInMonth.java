package week03;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// 월의 일수를 출력하기
		Scanner input = new Scanner(System.in);
		int month;
		int days = 0;
		
		System.out.print("일수를 알고 싶은 월을 입력하시오: ");
		month = input.nextInt();
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;  //고의적으로 break문을 생략하여서 여러 가지 경우를 동일한 문장으로 처리하고 있다.
		case 2:
			days = 28;
			break;
		default:
			days = 31;
			break;
		}
		System.out.println(month+ "월의 날수는 "+ days);
		
	}

}
