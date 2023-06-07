package week09_배치_관리자_버튼순서;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class 계산기 extends JFrame {

    public 계산기() {
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 전체 패널을 BorederLayout
        JPanel panel = new JPanel(new BorderLayout());
        add(panel);

        //입력
        JTextField field = new JTextField(30);
        panel.add(field, BorderLayout.NORTH);
        //버튼
        JPanel button = new JPanel(new GridLayout(0, 5, 5, 5));
        panel.add(button, BorderLayout.CENTER);

        
        button.add(new JButton("BackSpace"));
        button.add(new JButton(""));
        button.add(new JButton(""));
        button.add(new JButton("CE"));
        button.add(new JButton("C"));
        button.add(new JButton("7"));
        button.add(new JButton("8"));
        button.add(new JButton("9"));
        button.add(new JButton("/"));
        button.add(new JButton("sqrt"));
        button.add(new JButton("4"));
        button.add(new JButton("5"));
        button.add(new JButton("6"));
        button.add(new JButton("x"));
        button.add(new JButton("%"));
        button.add(new JButton("1"));
        button.add(new JButton("2"));
        button.add(new JButton("3"));
        button.add(new JButton("-"));
        button.add(new JButton("1/x"));
        button.add(new JButton("0"));
        button.add(new JButton("+/-"));
        button.add(new JButton("."));
        button.add(new JButton("."));
        button.add(new JButton("="));

       
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
    	계산기 c = new 계산기();
    }
}
