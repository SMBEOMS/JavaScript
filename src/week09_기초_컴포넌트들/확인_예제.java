package week09_기초_컴포넌트들;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

public class 확인_예제 extends JFrame{
	public 확인_예제() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300,200);//메소드 프레임의 위치와 크기를 설정한다
		setLocation(screenSize.width/2, screenSize.height/2); //메소드 프레임의 위치와 크기를 설정한다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		Image img = kit.getImage("icon.gif");
		setIconImage(img); //메소드 윈도우 시스템에 타이틀바, 태스크 스위처에 표시할 아이콘을 알려준다.
		setLayout(new FlowLayout());
		JButton button = new JButton("button");
		this.add(button);
		setVisible(true);
		
	}

}
