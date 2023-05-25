package week11_예외와메소드;

import java.io.IOException;

public class 예외처리하기 {
	public static void main(String[] args) {
		try {
			System.out.println(readString());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public static String readString() throws IOException {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하시오:");
		System.in.read(buf);
		return new String(buf);
	}
}