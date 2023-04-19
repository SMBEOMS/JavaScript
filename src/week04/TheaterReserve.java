package week04;

import java.util.Scanner;

public class TheaterReserve {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int size = 10;
		int[] seats = new int[size];
		
		while(true) {
			System.out.println("-----------------");
			for(int i = 0;i<size;i++)
				System.out.print(i+1 + " ") ;
			System.out.println("\n-----------------");
			for(int i = 0;i<size;i++)
				System.out.print(seats[i]+1 + " ") ;
			System.out.println("\n-----------------");
			System.out.print("원하는 좌석번호를 입력하세요(종료는-1):");
			
			int s = input.nextInt();
			if(s == -1)
				break;
			if(seats[s-1] == 0) {
				seats[s-1]=1;
				System.out.println("예약되었습니다.");
			}else {
				System.out.println("이미 예약된 자리입니다.");
			}
			
		}
	}

}
