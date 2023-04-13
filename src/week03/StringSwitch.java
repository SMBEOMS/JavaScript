package week03;
import java.util.Scanner;
public class StringSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 String month;
		 System.out.println("월의 이름을 입력하시요.");
	     month = input.next();
	     
	     int monthNumber;
	     
	    switch (month) {
	    case "january":
	    case "JAN":
	    case "jan":
	    	monthNumber = 1;
	    	break;
	    case "february":
	    case "FEB":
	    case "feb":
	    	monthNumber = 2;
	    	break;
	    case "march":
	    case "MAR":
	    case "mar":
	    	monthNumber = 3;
	    	break;
	    
	    default:
	    	monthNumber = 0;
	    }
	    
	    System.out.println(monthNumber);
	    
	    

}
}

