package week03_switch문;

import java.util.Scanner;


public class Month2Int {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String Month;
		
		System.out.print("Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec 중 월의 입력을 입력하시오: ");
		Month = input.next();
		
		switch(Month) {
			case "Jan":
				System.out.println("1월");
				break;
			case "Feb":
				System.out.println("2월");
				break;
			case "Mar":
				System.out.println("3월");
				break;
			case "Apr":
				System.out.println("4월");
				break;
			case "May":
				System.out.println("5월");
				break;
			case "Jun":
				System.out.println("6월");
				break;
			case "Jul":
				System.out.println("7월");
				break;
			case "Aug":
				System.out.println("8월");
				break;
			case "Sep":
				System.out.println("9월");
				break;
			case "Oct":
				System.out.println("10월");
				break;
			case "Nov":
				System.out.println("11월");
				break;
			case "Dec":
				System.out.println("8월");
				break;
		}

	}

}
