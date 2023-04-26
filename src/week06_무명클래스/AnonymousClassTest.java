package week06_무명클래스;

public class AnonymousClassTest {

	public static void main(String[] args) {
		RemoteControl ac= new RemoteControl() {//무명 클래스 정의
			public void turnOn(){
				System.out.println("TV turnOn()");
			}
			public void turnOff() {
				System.out.println("Tv turnOff()");
			}
		};
		ac.turnOn();
		ac.turnOff();
	}

}
