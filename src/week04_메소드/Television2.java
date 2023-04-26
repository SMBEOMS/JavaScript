package week04_메소드;

public class Television2 {
	int channel; //채널번호 필드 정의 객체의 속성을 나타낸다.
	int volume; //볼륨
	boolean onOff; //전원 상태
	void print() {
	System.out.println("채널은 "+ channel + "이고 볼륨은 " + volume +"입니다.");
		 }
	int getChannel() {
		return channel; //메소드의 종료 > return을 사용합니다. return 뒤에 수식을 적으면 수식의 값이 반환됩니다.
	}

}
