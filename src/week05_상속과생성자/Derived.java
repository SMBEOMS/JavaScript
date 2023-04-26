package week05_상속과생성자;

public class Derived extends Base{
	public Derived(String msg) {
		super(msg);
		System.out.println("Derived() 생성자");
	}

}