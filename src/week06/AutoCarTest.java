package week06;

public class AutoCarTest {

	public static void main(String[] args) {
		OperateCar obj = new AutoCar(); //인터페이스
		obj.start();
		obj.setSpeed(30);
		obj.turn(15);
		obj.stop();
	}

}
