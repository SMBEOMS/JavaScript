package week06_디폴트메소드와정적메소드;

public class DefaultMethodTest implements MyInterface{
	public void myMethod1() {
		System.out.println("myMethod1()");
	}
	public static void main(String[] args) {
		DefaultMethodTest obj = new DefaultMethodTest();
		obj.myMethod1();
		obj.myMethod2();
	}

}
