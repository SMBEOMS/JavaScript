package week03_배열정렬;

import java.util.Arrays;
import java.util.Scanner;
public class 배열정렬 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//배열에 저장된 숫자를 크기 순으로 정렬하려면 Arrays.sort()사용
		// 숫자를 입력하고 r에 넣으면 됌
		final int SIZE = 10;
		int[] numbers = new int[SIZE];
		
		for(int i=0;i<SIZE;i++) {
			int r =(int)(Math.random() * 100);
			numbers[i]=r;
		}
		System.out.print("최초의 리스트: ");
		for(int r : numbers)
			System.out.print(r + " ");
		Arrays.sort(numbers);
		
		System.out.print("\n정렬된 리스트: ");
		for(int r : numbers)
			System.out.print(r + " ");
	}

}
