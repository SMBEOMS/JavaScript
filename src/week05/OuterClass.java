package week05;

public class OuterClass {
	// 정벅 변수 예제
	private int value = 10;
	
	class InnerClass{
		public void myMethod() {
			System.out.println("외부 클래스의 private 변수 값 : " + value);
		}
	}
	OuterClass(){
		InnerClass obj = new InnerClass();
		obj.myMethod();
	}
}
