package week03_고급배열;

public class for_each루프 {

	public static void main(String[] args) {
		//for-each 루프
		int[] numbers = {10, 20, 30};
		for (int value : numbers) //변수 value에는 첫 번째 원소부터 마지막 배열 원소까지 차례대로 대입왼다.
			System.out.print(value+ " "); 
	}

}
