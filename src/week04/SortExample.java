package week04;

import java.util.Arrays;

import week04_메소드.Math;

public class SortExample {

	public static void main(String[] args) {
		// 배열 정렬
		final int SIZE = 10;
		int[] numbers = new int[SIZE];
		
		for(int i = 0; i<SIZE; i++) {
			int r = (int)(Math.random() * 100);
			numbers[i] = r;
			
		}
		System.out.print("최초의 리스트: ");
		for(int r : numbers)
			System.out.print(r + " ");
		Arrays.sort(numbers); // 배열에 저장된 숫자를 크기 순으로 정렬
		
		System.out.print("\n정렬된 리스트: ");
		for(int r : numbers)
			System.out.print(r + " ");
	}

}
