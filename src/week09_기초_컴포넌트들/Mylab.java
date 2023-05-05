package week09_기초_컴포넌트들;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mylab {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel panle = new JPanel();
		f.add(panle);
		
		JLabel label1 = new JLabel("화씨 온도");
		JLabel label2 = new JLabel("섭씨 온도");
		JTextField field1 = new JTextField(20);
		JTextField field2 = new JTextField(20);
		JButton button = new JButton("변환");
		
		panle.add(label1);
		panle.add(field1);
		panle.add(label2);
		panle.add(field2);
		panle.add(button);
		
		f.setSize(300, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("온도변환기");
		f.setVisible(true);
	}

}
