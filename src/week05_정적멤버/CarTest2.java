package week05_정적멤버;

public class CarTest2 {

	public static void main(String[] args) {
		Car2 c1 = new Car2("S600", "White", 80); //첫 번째 생성자 호출
		Car2 c2 = new Car2("E500", "Blue", 60); //두 번째 생성자 호출
		Car2 c3 = new Car2("AMG", "Black", 150);
		int n = Car2.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차2 수 = " + n);
	}

}
