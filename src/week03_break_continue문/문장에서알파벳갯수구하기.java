package week03_break_continue문;

public class 문장에서알파벳갯수구하기 {

	public static void main(String[] args) {
		//Continue 문
	    String s = "no news is good news";
	    int n = 0;
	    
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) != 'n') {
	            continue;
	        }
	        
	        // 'n'의 개수를 하나 증가한다.
	        n++;
	    }
	    System.out.println("문장에서 발견된 'n'의 개수: " + n);
	}
}