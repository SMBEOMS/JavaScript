package week05_생성자;

public class MyCounterTest {

	public static void main(String[] args) {
		MyCounter obj1 = new MyCounter(100);
		MyCounter obj2 = new MyCounter(200);
		
		System.out.println("객체1 의 "+obj1.counter);
		System.out.println("객체2 의 "+obj2.counter);
	}

}
