package week10_액션이벤트_문제만들기;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class 시험문제_5_숫자맞히기게임 extends JFrame implements ActionListener{
	private JLabel label;
	private JTextField field;
	private JButton button;
	private int randomNumber;
	
	public 시험문제_5_숫자맞히기게임() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("숫자맞히기게임");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JLabel add = new JLabel("1에서 100 사이의 숫자를 입력하세요: ");
		field = new JTextField(5);
		button = new JButton("비교하기");
		button.addActionListener(this);
		label = new JLabel();
		
		panel.add(add);
		panel.add(field);
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		
		generateRandomNumber();
	}
	
	private void generateRandomNumber() {
		Random random = new Random();
		randomNumber = random.nextInt(100) + 1;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			try {
				int guess = Integer.parseInt(field.getText());
				checkGuess(guess);
			} catch (NumberFormatException ex) {
				label.setText("유효한 숫자를 입력하세요!");
			}
		}
	}
	
	private void checkGuess(int guess) {
		if (guess == randomNumber) {
			label.setText("정답입니다!");
			button.setEnabled(false);
		} else if (guess < randomNumber) {
			label.setText("너무 작습니다!");
		} else {
			label.setText("너무 큽니다!");
		}
		field.setText("");
		field.requestFocus();
	}
		
	public static void main(String[] args) {
		new 시험문제_5_숫자맞히기게임();
	}
}
