package week09_GUI작성절차;

import javax.swing.*;
import java.awt.FlowLayout;

public class 시험공부4_컴포넌트생성과추가 extends JFrame{
	public 시험공부4_컴포넌트생성과추가() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		this.add(button);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
