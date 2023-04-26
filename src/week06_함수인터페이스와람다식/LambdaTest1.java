package week06_함수인터페이스와람다식;

public class LambdaTest1 {
	public static void main(String[]args) {
		MyInterface hello=()->System.out.println("Hello Lambda!");
		hello.sayHello();
	}

}
