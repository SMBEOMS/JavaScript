package week09_배치_관리자_버튼순서;

import java.awt.*;
import javax.swing.*;

public class 시험공부_4절대위치실습 extends JFrame {
    private JButton b1;
    private JButton b2;
    private JButton b3;

    public 시험공부_4절대위치실습() {
        setTitle("Absolute Position Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        JPanel p = new JPanel();
        p.setLayout(null);  // 절대위치로 배치하기

        b1 = new JButton("Button #1");
        p.add(b1);
        b2 = new JButton("Button #2");
        p.add(b2);
        b3 = new JButton("Button #3");
        p.add(b3);

        b1.setBounds(20, 5, 95, 30);
        b2.setBounds(50, 45, 105, 70);
        b3.setBounds(180, 15, 105, 90);
        add(p);
        setVisible(true);
    }

    public static void main(String args[]) {
        시험공부_4절대위치실습 f = new 시험공부_4절대위치실습();
    }
}
