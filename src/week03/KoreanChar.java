package week03;

public class KoreanChar {

	public static void main(String[] args) {
		  char ch = '가';
	        char prevConsonant = 'ㄱ'; 
	        do {
	            char consonant = getConsonant(ch); 
	            if (consonant != prevConsonant) { 
	            	System.out.println("\n--...--\n");
	                prevConsonant = consonant; 
	            }
	            System.out.print(ch + " ");
	            ch++;
	        } while (ch <= '힣');
	    }
	    
	    
	    private static char getConsonant(char ch) {
	        int code = (int)ch;
	        int consonantCode = ((code - 44032) / 28) / 21; 
	        return (char)(consonantCode + 12593);

	    }
}
