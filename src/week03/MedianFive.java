package week03;
import java.util.Arrays;
import java.util.Scanner;
public class MedianFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int[] number = new int[5];
		for (int i=0; i <5; i++) {
			 System.out.println(i+1 + "번째 숫자를 입력해주세요.");
		     number[i] = input.nextInt();
		 }
		
		Arrays.sort(number);
		
		System.out.println("이력하신 5개의 숫자 중 가운데 값은" + number[2] +"입니다.");
	}

}
