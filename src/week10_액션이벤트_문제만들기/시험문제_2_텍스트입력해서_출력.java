package week10_액션이벤트_문제만들기;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 시험문제_2_텍스트입력해서_출력 extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton button;
    private JLabel label;

    public 시험문제_2_텍스트입력해서_출력() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("텍스트 출력 예제");

        JPanel panel = new JPanel();
        textField = new JTextField(20);
        button = new JButton("출력");
        label = new JLabel();

        button.addActionListener(this);
        panel.add(textField);
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String text = textField.getText();
            label.setText("입력된 텍스트: " + text);
        }
    }

    public static void main(String[] args) {
        new 시험문제_2_텍스트입력해서_출력();
    }
}
