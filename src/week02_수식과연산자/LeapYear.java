package week02_수식과연산자;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Year;
		boolean ThisYear;
		
		System.out.println("년도를 입력하세요: ");
		Year = input.nextInt();
		
		ThisYear = (Year%4 == 0); // 4로 나누고 나머지가 0인 년도가 윤년이라서 %를 사용했습니다
				
		System.out.println(ThisYear);	
	}

}
