package week06;

public class FlyingCar1 implements Drivable, Flyabe{
	public void drive() {
		System.out.println("I'm driving");
	}
	public void fly() {
		System.out.println("I'm flying");
	}
	public static void main(String[] args) {
		FlyingCar1 obj = new FlyingCar1();
		obj.drive();
		obj.fly();
	}
}