package week02_우선순위와결합규칙;

import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		//근을 계산하는 프로그램
		Scanner input = new Scanner(System.in);
		double b;
		double c;
		double a = 1;
		System.out.println("x²+bx+c=0 일때 근을 구합시다.");
		// println을 사용하면 한줄밑으로 뛰기
		
		System.out.print("상수b를 입력하세요: "); 
		b = input.nextDouble();
		System.out.print("상수a를 입력하세요: ");
		c =  input.nextDouble();
		
		double Quadratic_formula = (-b +Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
		double Quadratic_formula2 = (-b -Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
		// 제곱은 ** 인데 **이 안되서 Math.pow를 사용했습니다.
		//루트연산 = Math.sqrt( 값 );
		
		
		System.out.println("첫번째의 근: " + Quadratic_formula);
		System.out.println("두번째의 근: " + Quadratic_formula2);
		System.out.println("(x-" + "(" + Quadratic_formula+ "))"+ "(x-" + "(" + Quadratic_formula2 + "))");
	}

}
