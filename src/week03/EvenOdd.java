package week03;
import java.util.Scanner; //Scanner 클래스를 포함합니다.


public class EvenOdd {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int a;
		 int b;
		 
		 System.out.println("정수를 입력하시오.");
	     a = input.nextInt();
	     b = a%2;
	    		 
	     if(b == 0) {
	    	 System.out.println("짝수입니다.");
	    	 
	     }
	     else {
	    	 System.out.println("홀수입니다.");

	     }
    	 System.out.println("프로그램이 종료되었습니다.");
	}

}
