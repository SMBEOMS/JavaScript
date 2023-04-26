package week04_메소드;

public class Television {
	//메소드는 입력을 받아서 처리를 하고 결과를 반환하는 가상적인 상자와 같다
	// int(반환형) add(메소드 이름) (int x, int y) 매개변수 
	int channel; //채널번호 필드 정의 객체의 속성을 나타낸다.
	int volume; //볼륨
	boolean onOff; //전원 상태
	void print() {
	System.out.println("채널은 "+ channel + "이고 볼륨은 " + volume +"입니다.");
		 }
}
