package week02_변수와자료형;

import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius;

		
		final double PI =  3.141592;
		// 반지름 = radius 
		// 면적  = area
		System.out.print("반지름을 입력하세요: ");
		radius = input.nextDouble();

		
		double area = radius*radius*PI; // PI가 소숫점이 많아서 double을 사용했습니다.
		System.out.println("반지름이 " + radius + "인 원의 면적은 " + area + "입니다.");
	}

}
