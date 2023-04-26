package week05_정적메소드오버라이딩;

public class Animal {
	public static void eat() {
		System.out.println("Animal의 정적 메소드 eat()");
	}
	public void sound() {
		System.out.println("Animal의 인스턴스 메소드 sound()");
	}
}
