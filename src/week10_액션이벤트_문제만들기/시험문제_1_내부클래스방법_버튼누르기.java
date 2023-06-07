package week10_액션이벤트_문제만들기;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//문제: 자바에서 버튼을 클릭했을 때 메시지를 출력하는 프로그램을 작성해보세요.
//
//요구사항:
//
//프로그램에는 버튼이 하나 존재해야 합니다.
//버튼을 클릭하면 콘솔에 "버튼이 클릭되었습니다."라는 메시지를 출력해야 합니다.
//이벤트 처리는 이벤트 리스너를 사용하여 구현해야 합니다.
//참고 정보:
//
//버튼에 대한 이벤트 처리를 위해 ActionListener 인터페이스를 사용할 수 있습니다.
//ActionListener 인터페이스를 구현한 클래스에서는 actionPerformed 메서드를 오버라이딩하여 원하는 동작을 구현할 수 있습니다.

public class 시험문제_1_내부클래스방법_버튼누르기 extends JFrame{
	private JButton button;
	private JLabel label;

	public 시험문제_1_내부클래스방법_버튼누르기() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("두번째 문제");
		
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러봐");
		label = new JLabel("아직 버튼이 눌려지지 않았어.");
		
		
		시험문제_1_test listener = new 시험문제_1_test();
		button.addActionListener(listener);
		
		
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		
	}
	private class 시험문제_1_test implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("마침내 버튼이 눌려졌습니다.");
			}
		}
	}
	public static void main(String[] args) {
		new 시험문제_1_내부클래스방법_버튼누르기();
	}
}
