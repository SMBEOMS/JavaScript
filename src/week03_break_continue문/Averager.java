package week03_break_continue문;
import java.util.Scanner;
public class Averager {

	public static void main(String[] args) {
		//break문
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		
		while(true) {
			System.out.print("점수를 입력하시오(0을 입력하면 종료됩니다.): ");
			int grade = input.nextInt();
			if (grade < 0) {
				break;} //0 이하를 쳐야 while문 종료
			total += grade;
			count++;
		}
		System.out.println("평균은 " + total / count);
		
	}

}

