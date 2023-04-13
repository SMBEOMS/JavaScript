package week04;

public class Car {
	String color; // 색상
	int gear; // 현재 기어
	double speed; // 현재 속도
	
	int changeGear; //기어바꾸기
	double speedUp; //감속하기
	double speedDown; //가속하기
	
	
	public String toString() { 
		return "Car [color=" + color + ", speed=" + speed + "km/h" + ", gear=" + gear + "]";
	}
}
