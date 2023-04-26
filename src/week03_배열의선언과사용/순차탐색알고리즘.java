package week03_배열의선언과사용;
import java.util.Scanner;

public class 순차탐색알고리즘{

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        int[] s = {0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100};
       
        
        System.out.print("정수 값을 입력하세요: ");
        int num = input.nextInt();
        int i;
        
        for (i = 0; i < s.length-1; i++) {
            if (num >= s[i] && num < s[i+1]) {
                System.out.printf("%d은(는) %d보다 크고 %d보다 작습니다.", num, s[i], s[i+1]);
                break;
            }
        }
        
        if (i == s.length-1) {
            System.out.printf("%d은(는) %d 이상의 수입니다.", num, s[s.length-1]);
        }
        input.close();
    }

}
