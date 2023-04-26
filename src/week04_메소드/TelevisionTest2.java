package week04_메소드;

public class TelevisionTest2 {

	public static void main(String[] args) {
		Television2 myTv = new Television2(); //객체 생성하기
		myTv.channel = 7; //객체의 멤버에 접근할 때는 멤버 연산자(.)를 사용한다.
		myTv.volume = 9;
		myTv.onOff =true;
		int ch = myTv.getChannel();
		System.out.println("현재 채널은 " + ch + "입니다.");
	}

}
