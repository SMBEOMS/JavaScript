package week05_메소드_오버라이딩;

public class Child extends Parent{
	public void print() {
		super.print(); //부모 클래스의 메소드 호출
		System.out.println("자식 클래스 print() 메소드");
	}//메소드 오버라이드
	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
	}
}
