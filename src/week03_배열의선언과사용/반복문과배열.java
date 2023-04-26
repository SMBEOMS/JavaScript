package week03_배열의선언과사용;

public class 반복문과배열 {
	public static void main(String[] args) {
		
		int[]s = new int[10];
		
		for(int i = 0; i < s.length; i++) {
			s[i]=i;
			
		}
		for(int i = 0 ; i < s.length ;i++) {
			System.out.print(s[i]+ " ");
		}
	}

}
