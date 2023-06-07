package week09_배치_관리자_버튼순서;


import java.awt.*;
import javax.swing.*;

//컴포넌트들을 격자 모양으로 배치한다.

public class 시험공부_3GridLayout실습 extends JFrame{
	
	public 시험공부_3GridLayout실습() {
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0,3)); //3개의 열과 필요한 만큼의 행
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		시험공부_3GridLayout실습 f = new 시험공부_3GridLayout실습();
	}

}
