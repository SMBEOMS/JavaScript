package week03;

import java.util.Scanner;


public class Score {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Score;
		
		System.out.print("성적을 입력하시오: ");
		Score = input.nextInt();
		
		if(Score >= 90) {
			System.out.println("학점 A");
		}else if(Score >= 80) {
			System.out.println("학점 B");
		}else if(Score >=70) {
			System.out.println("학점 C");
		}else {
			System.out.println("학점 F");
		}
		
		
		
	}

}
