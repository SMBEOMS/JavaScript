package week03_for루프;
import java.util.Scanner;

public class 소수구하기2 {

	public static void main(String[] args) {
		//입력한 정수까지의 소수구하기
		Scanner input = new Scanner(System.in);
		  int a=0;
		  int c;
		  System.out.print("정수를 입력해주세요: ");
		  c = input.nextInt();

        for(int i=2; i<=c; i++) // 1은 소수가 아니므로 2부터 시작
        {
            for(int j=2; j<=i; j++)
            {
                 if(i%j ==0) 
                 {
                      a ++;
                 }    
            }
            
            // 소수는 1과 자기자신으로만 나눠지므로 자기자신으로 한번만 나눠질때 소수
            if(a==1)
            {
                 System.out.print(i+" ");
            }
            a=0;
        }
	}

}
