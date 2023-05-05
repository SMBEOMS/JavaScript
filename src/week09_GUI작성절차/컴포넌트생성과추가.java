package week09_GUI작성절차;

import javax.swing.*;
import java.awt.FlowLayout;

public class 컴포넌트생성과추가 extends JFrame{
	public 컴포넌트생성과추가() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout()); //배치 관리자 설정
		JButton button = new JButton("버튼"); //컴포넌트 생성 및 추가
		this.add(button);
		setVisible(true);
	}

	public static void main(String[] args) {
		컴포넌트생성과추가 f = new 컴포넌트생성과추가();
	}

}
