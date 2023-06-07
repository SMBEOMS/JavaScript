package week10_액션이벤트_문제만들기;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 시험문제_1_정답_내부클래스방법_버튼누르기 extends JFrame {
    private JButton button;
    private JLabel label;

    public 시험문제_1_정답_내부클래스방법_버튼누르기() {
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("첫번째 문제");

        JPanel panel = new JPanel();
        button = new JButton("버튼을 누르시오");
        label = new JLabel("아직 버튼이 눌려지지 않았습니다.");

        ButtonClickListener listener = new ButtonClickListener();
        button.addActionListener(listener);

        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                label.setText("마침내 버튼이 눌려졌습니다.");
            }
        }
    }

    public static void main(String[] args) {
        new 시험문제_1_정답_내부클래스방법_버튼누르기();
    }
}
