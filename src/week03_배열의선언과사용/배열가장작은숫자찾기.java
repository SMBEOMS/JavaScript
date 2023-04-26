package week03_배열의선언과사용;

public class 배열가장작은숫자찾기 {

	public static void main(String[] args) {
		// 배열에 담긴 숫자에서 가장 작은 숫자를 찾는 프로그램을 만드시오.
		int s[] = {12, 3, 19, 6, 18, 8, 12, 4, 1, 19, 0};
        
        int min = s[0]; // 최솟값을 배열의 첫 번째 요소로 초기화
        
        for (int i = 0; i < s.length; i++) {
            if (s[i] < min) { // 현재 요소가 최솟값보다 작으면 갱신
                min = s[i];
            }
        }
        
        System.out.println("배열 s의 최솟값: " + min);
		
	}

}
