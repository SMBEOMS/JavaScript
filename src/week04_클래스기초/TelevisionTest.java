package week04_클래스기초;

public class TelevisionTest {

	public static void main(String[] args) {
		//객체 생성하기
		Television tv = new Television(); //객체 생성하기
		tv.channel = 7; //객체의 멤버에 접근할 때는 멤버 연산자(.)를 사용한다.
		tv.volume = 9;
		tv.onOff =true;
		
		System.out.println("텔레비전의 채널은 "+ tv.channel + "이고 볼륨은 "+tv.volume + "입니다.");
		

	}

}
