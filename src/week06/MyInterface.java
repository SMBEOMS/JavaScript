package week06;

public interface MyInterface {
	public void myMethod1();
	default void myMethod2() {
		System.out.println("myMethod2()");
	}
}
