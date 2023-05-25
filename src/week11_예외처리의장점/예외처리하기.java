package week11_예외처리의장점;

public class 예외처리하기 {
	public static void main(String args[]) {
		try {
		int num = getStringNum();
		System.out.println(num);
		
		}
		catch(NumberFormatException e) {
		System.out.println(e.getMessage());
		}
	}
	public static int getStringNum() throws NumberFormatException{
		int num = Integer.parseInt("ABC");
		return num;
	}
}