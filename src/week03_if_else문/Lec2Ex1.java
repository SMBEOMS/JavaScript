package week03_if_else문;

import java.util.Scanner;
public class Lec2Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		System.out.print("정수를 입력해주세요: ");
		a = input.nextInt();
		
		System.out.print("두번째 정수를 입력해주세요: ");
		b = input.nextInt();
		
		if(a>b) {
			System.out.print("첫번째 정수가 더큽니다: " + a);
		}else if (a<b){
			System.out.print("두번째 정수가 더큽니다: " + b);
		}
		
		
			

	}

}
