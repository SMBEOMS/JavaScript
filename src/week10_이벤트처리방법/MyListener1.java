package week10_이벤트처리방법;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyListener1 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		button.setText("마침내 버튼이 눌려졌습니다");
		
	}

}
