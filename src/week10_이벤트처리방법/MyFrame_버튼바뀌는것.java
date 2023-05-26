package week10_이벤트처리방법;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame_버튼바뀌는것 extends JFrame implements ActionListener{
	private JButton button;
	private JLabel label;
	private int state;
	
	
	public MyFrame_버튼바뀌는것() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		button.addActionListener(this);
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		
	}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				if(state == 0) {
					label.setText("마침내 버튼이 눌려졌습니다.");
					state = 1;
				}else {
					label.setText("아직 버튼이 눌러지지않았습니다");
					state = 0;
				}
			}			
		}
	public static void main(String[] args) {
		MyFrame_버튼바뀌는것 t = new MyFrame_버튼바뀌는것();

	}

}
