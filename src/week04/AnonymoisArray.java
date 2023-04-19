package week04;

public class AnonymoisArray {

	public static void main(String[] args) {
		// 고급 배열
		// 무명 배열의 예
		System.out.println("숫자들의 합: "+ sum(new int[] { 1, 2, 3, 4}));
	}
		
	public static int sum(int[] numbers) {
			int total = 0;
			for (int i = 0; i < numbers.length; i++) {
				total = total + numbers[i];
			}
			return total;
		}

}
