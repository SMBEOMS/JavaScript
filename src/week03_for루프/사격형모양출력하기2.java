package week03_for루프;

import java.util.Scanner;

public class 사격형모양출력하기2 {

	public static void main(String[] args) {
		//가로,입력 입력하고 출력하기
		Scanner sc = new Scanner(System.in);
        System.out.print("가로 길이를 입력하세요: ");
        int width = sc.nextInt();
        System.out.print("세로 길이를 입력하세요: ");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}