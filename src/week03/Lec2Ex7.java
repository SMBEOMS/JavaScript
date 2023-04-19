package week03;

public class Lec2Ex7 {

	public static void main(String[] args) {
        int[] s = {0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100};
        int key = 13;

        int index = sequentialSearch(s, key);

        if (index == -1) {
            System.out.println("입력한 값이 배열 범위를 벗어납니다.");
        } else if (index == 0) {
            System.out.printf("%d은 %d보다 작습니다.\n", key, s[index]);
        } else {
            System.out.printf("%d은 %d보다 크고 %d보다 작습니다.\n", key, s[index - 1], s[index]);
        }
    }

    public static int sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // 탐색 키를 찾은 경우 인덱스 반환
            } else if (arr[i] > key) {
                return i - 1; // 탐색 키보다 큰 값이 나온 경우, 이전 인덱스 반환
            }
        }
        return arr.length - 1; // 배열의 끝까지 탐색 키를 찾지 못한 경우, 마지막 인덱스 반환
    }
}




