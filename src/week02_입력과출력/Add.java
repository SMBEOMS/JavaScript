package week02_입력과출력;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int sum;
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		x = input.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오: ");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println("두 수의 합은: " + sum);
	}

}
