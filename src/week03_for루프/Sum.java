package week03_for루프;

public class Sum {

	public static void main(String[] args) {
		int sum = 0;
		//  형식  = for(초기식; 조건식; 증감식){반복분장};
		for(int i = 1; i <=10; i++)
			sum += i;
		
		System.out.printf("1부터 10까지의 정수의 합 = %d", sum);
	}

}
