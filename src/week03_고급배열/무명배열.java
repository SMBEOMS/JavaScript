package week03_고급배열;

public class 무명배열 {

	public static void main(String[] args) {
		// 무명 배열
		// >자바에서는 배열의 이름을 지정하지 않고 단순히 초기값만으로 배열을 생성시킬수있다.
		// >무명배열은 즉시 배열을 만들어서 함수의 인수로 전달하고자 할때 많이 사용된다.
		System.out.println("숫자들의 합: " + sum(new int[] {1, 2, 3, 4})); //무명 배열이 생성되어 sum()으로 전달된다.
	}	
	public static int sum(int[] numbers) {
			int total = 0;
			for (int i = 0; i<numbers.length ; i++) {
				total = total + numbers[i];
			}
			return total;
		}
		

	
}
