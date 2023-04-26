package week04_메소드;

public class TelevisionTest {

	public static void main(String[] args) {
		Television myTv = new Television(); //객체 생성하기
		myTv.channel = 7; //객체의 멤버에 접근할 때는 멤버 연산자(.)를 사용한다.
		myTv.volume = 9;
		myTv.onOff =true;
		myTv.print();
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 10;
		yourTv.onOff = true;
		yourTv.print();

	}

}
