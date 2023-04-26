package week03;
import java.util.Scanner;
public class 입력받은수가3의배수판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number;
		 System.out.println("숫자를 입력해주세요.");
	     number = input.nextInt();
	     if(number % 3 == 0) {
			 System.out.println("입력하신 숫자"+number+"은(는) 3의 배수입니다.");
	     }
	     else {
			 System.out.println("입력하신 숫자"+number+"은(는) 3의 배수가 아닙니다.");
	     }

	}

}
