package week05;

public class Car {
	// 정적 변수 예제
	private String model;
	private String color;
	private int speed;
	
	// 자동차의 시리얼 번호
	private int id;
	public static int numbers = 0;
	
	public Car(String m, String c, int s) {
		model = m;
		color = c;
		speed = s;
		
		// 자동차의 개수를 증가하고
		// Id에 대입한다.
		id = ++numbers;
	}
}
