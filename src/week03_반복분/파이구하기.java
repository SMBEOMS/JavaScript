package week03_반복분;

import java.util.Scanner;

public class 파이구하기 {
    public static void main(String[] args) {
    	//파이 구하기
        Scanner input = new Scanner(System.in);
        System.out.print("반복 횟수를 입력하세요: ");
        int n = input.nextInt();

        double pi = 0.0;
        int sign = 1;

        for (int i = 0; i < n; i++) {
            pi += sign * 4.0 / (2 * i + 1);
            sign = -sign;
        }

        System.out.println("π: " + pi);
    }
}
