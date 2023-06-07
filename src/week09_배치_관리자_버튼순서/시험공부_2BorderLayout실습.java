package week09_배치_관리자_버튼순서;

import java.awt.*;
import javax.swing.*;

// BorderLayout = 5개의 영역으로 구분하고 각각의 영역에 컴포넌트를 배치

public class 시험공부_2BorderLayout실습 extends JFrame{
	public 시험공부_2BorderLayout실습() {
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Ex) PAGE_START = panel.add(field, BorderLayout.NORTH);
//		Ex) PAGE_END = panel.add(field, BorderLayout.SOUTH);
//		Ex) LINE_START = panel.add(field, BorderLayout.WEST);
//		Ex) LINE_END = panel.add(field, BorderLayout.EAST);
//		EX) LINE_CENTER = panel.add(button, BorderLayout.CENTER);
		
		
		
		
		//프레임은 디폴트로 BorderLayout 이므로 사실은 불필요
		setLayout(new BorderLayout());
		
		//버튼을 추가한다
		
		add(new JButton("Center"),BorderLayout.CENTER);
		add(new JButton("Line Start"),BorderLayout.WEST);
		add(new JButton("LINE END"),BorderLayout.EAST);
		add(new JButton("Page START"),BorderLayout.NORTH);
		add(new JButton("Page End"),BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		
		시험공부_2BorderLayout실습 f = new 시험공부_2BorderLayout실습();
	}

}
