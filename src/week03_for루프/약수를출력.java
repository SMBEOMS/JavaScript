package week03_for루프;

import java.util.Scanner;

public class 약수를출력 {

	public static void main(String[] args) {
		// 약수출력
		Scanner input = new Scanner(System.in);
		int a;
	
		System.out.print("양의 정수를 입력하시오: ");
		a = input.nextInt();
		
		System.out.println(a + "의 약수는 다음과 같습니다.");
		
		for(int i = 1; i <= a; i++){ //1은 소수가아니므로 2부터시작
			if(a % i == 0){
				System.out.print(i +  " ");
		    }
		}	
	}
}
