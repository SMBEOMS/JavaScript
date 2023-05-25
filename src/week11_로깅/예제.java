package week11_로깅;

import java.util.logging.Logger;

public class 예제 {
	public static void main(String argv[]) {
		String filename = "test.dat";
		Logger.getGlobal().info(filename + " 파일을 오픈하였음 ");
		}
}
