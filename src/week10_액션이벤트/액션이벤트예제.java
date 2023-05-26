package week10_액션이벤트;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class 액션이벤트예제 extends JFrame {
    private JButton button1;
    private JButton button2;
    private JPanel panel;

    public 액션이벤트예제() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제");

        panel = new JPanel();

        button1 = new JButton("노란색");
        button1.addActionListener(new MyListener());
        panel.add(button1);

        button2 = new JButton("핑크색");
        button2.addActionListener(new MyListener());
        panel.add(button2);

        this.add(panel);
        this.setVisible(true);
    }

    private class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                panel.setBackground(Color.YELLOW);
            } else if (e.getSource() == button2) {
                panel.setBackground(Color.PINK);
            }
        }
    }
}

