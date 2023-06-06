package week09_기초_컴포넌트들;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 시험공부_실습2_피자주문화면_완성 extends JFrame {
    private JTextField field1;
    private int quantity;

    public 시험공부_실습2_피자주문화면_완성() {
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");

        JPanel panel = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        JLabel label1 = new JLabel("자바피자에 오신것을 환영합니다. 피자의 종류를 선택하시오.");
        panelA.add(label1);

        JButton button = new JButton("콤보 피자");
        JButton button2 = new JButton("포테이토 피자");
        JButton button3 = new JButton("불고기 피자");
        panelB.add(button);
        panelB.add(button2);
        panelB.add(button3);

        JLabel label2 = new JLabel("개수");
        field1 = new JTextField(3);
        field1.setText("0");
        panelB.add(label2);
        panelB.add(field1);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity++;
                field1.setText(String.valueOf(quantity));
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity++;
                field1.setText(String.valueOf(quantity));
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quantity++;
                field1.setText(String.valueOf(quantity));
            }
        });

        panel.add(panelA);
        panel.add(panelB);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        시험공부_실습2_피자주문화면_완성 f = new 시험공부_실습2_피자주문화면_완성();
    }
}
