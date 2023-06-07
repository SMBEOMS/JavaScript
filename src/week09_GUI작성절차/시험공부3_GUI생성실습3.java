package week09_GUI작성절차;
import javax.swing.*;
public class 시험공부3_GUI생성실습3 extends JFrame{ //Jframe을 상속하여서 MyFrame을 정의
	public 시험공부3_GUI생성실습3() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
	}

	public static void main(String[] args) {
		시험공부3_GUI생성실습3 f = new 시험공부3_GUI생성실습3();
	}

}
