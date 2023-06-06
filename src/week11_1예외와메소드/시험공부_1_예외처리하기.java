package week11_1예외와메소드;
 
// 오류 잡아보기 > 예외처리하기= 답
public class 시험공부_1_예외처리하기 {
	public static void main(String[] args) {
		System.out.println(readString());
	}
	public static String readString() {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하세요");
		//System.in.read(buf);
		return new String(buf);
	}

}
