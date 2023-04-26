package week06_디폴트메소드와정적메소드;

public interface MyInterface {
	public void myMethod1();
	default void myMethod2() {
		System.out.println("myMethod2()");
	}
}
