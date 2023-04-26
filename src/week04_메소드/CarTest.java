package week04_메소드;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Car MyCar = new Car();
		
		MyCar.color = "red";
		MyCar.gear = 2;
		MyCar.speed = 80;
		
		System.out.println("현재 자동차의 상황: "+ MyCar.toString());
		//=========================================================
		System.out.print("기어 변경을 하기위해 정수를 입력하시오: ");
		MyCar.gear = input.nextInt();
		System.out.println(MyCar.toString());
		//=========================================================
		System.out.print("가속을 하기위한 추가의 속도를 입력하시오: ");
		MyCar.speedUp = input.nextInt();
		MyCar.speed = MyCar.speed + MyCar.speedUp;
		System.out.println(MyCar.toString());
		//=========================================================
		System.out.print("감속을 하기위한 감소의 속도를 입력하시오: ");
		MyCar.speedDown = input.nextInt();
		MyCar.speed = MyCar.speed - MyCar.speedDown;
		System.out.println(MyCar.toString());
		
	
	}
}
