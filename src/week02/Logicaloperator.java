package week02;

public class Logicaloperator {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		System.out.println((x == 3) && (y == 7));
		System.out.println((x == 3) || (y == 7));
		
		// && = AND 연산 , x와y가 모두 참이면 참, 그렇지 않으면 거짓
		// || = OR 연산 , x나y중에서 하나만 참이면 참, 모두 거짓이면 거짓
		// ! = NOT 연산 , x가 참이면 거짓 x가 거짓이면 참
	}

}
