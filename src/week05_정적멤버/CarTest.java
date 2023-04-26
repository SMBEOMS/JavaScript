package week05_정적멤버;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("S600", "White", 80); //첫 번째 생성자 호출
		Car c2 = new Car("E500", "Blue", 60); //두 번째 생성자 호출
		Car c3 = new Car("AMG", "Black", 150);
		int n = Car.numbers; // 정적변수
		System.out.println("지금까지 생성된 자동차 수 = " + n);
	}

}
