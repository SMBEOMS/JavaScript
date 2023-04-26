package week05_메소드로객체전달하고반환;

public class MyCounterTest1 {

	public static void main(String[] args) {
		MyCounter1 obj = new MyCounter1();
		int x = 10;
		obj.inc(x);
		
		System.out.println("x= " + x);
	}

}
