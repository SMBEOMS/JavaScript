package week09_배치_관리자_버튼순서;
import java.awt.*;
import javax.swing.*;

import week09_기초_컴포넌트들.시험공부_실습2_피자주문화면_완성;

// 컴포넌트들을 왼쪾에서 오른쪽으로 버튼을 배치한다.
// 패널과 애플릿의 디폴트 배치관리자이다.
public class 시험공부_1FlowLayout실습 extends JFrame{
	public 시험공부_1FlowLayout실습() {
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel;
		// 패널을 생성하고 배치 관리자를 FLowLayout으로 설정		
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//패널에 버튼을 생성하여 추가
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("B4"));
		panel.add(new JButton("Long Button5"));
		
		add(panel);
		
		pack();
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		시험공부_1FlowLayout실습 f = new 시험공부_1FlowLayout실습();
	}

}
