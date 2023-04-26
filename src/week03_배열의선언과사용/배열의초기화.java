package week03_배열의선언과사용;

public class 배열의초기화 {

	public static void main(String[] args) {
		int[] scores = {10, 20, 30, 40, 50, 60};
		for (int i = 0; i < scores.length; i++) //각 배열은 length라는 필드를 가지고있다.
												// length 필드는 배열의 크기를 나타낸다. 따라서 이것을 이용하면 배열의 크기만큼 반복을 시킬 수 있다.
			System.out.print(scores[i]+ " ");
	}

}
