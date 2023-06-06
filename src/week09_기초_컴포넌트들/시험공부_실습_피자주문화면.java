package week09_기초_컴포넌트들;

import java.awt.FlowLayout;

import javax.swing.*;

public class 시험공부_실습_피자주문화면 extends JFrame{
	public 시험공부_실습_피자주문화면() {
	setSize(600,150);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("MyFrame");
	
	JPanel panel = new JPanel();
	JPanel panelA = new JPanel();
	JPanel panelB = new JPanel();
	
	JLabel label1 = new JLabel("자바피자에 오신것을 환영합니다.피자의 종류를 선택하시오.");
	panelA.add(label1);
	
	
	JButton button = new JButton("콤보 피자");
	JButton button2 = new JButton("포테이토 피자");
	JButton button3 = new JButton("불고기 피자");
	panelB.add(button);
	panelB.add(button2);
	panelB.add(button3);
	
	
	JLabel label2 = new JLabel("개수");
	JTextField field1 = new JTextField(10);
	panelB.add(label2);
	panelB.add(field1);
	
	panel.add(panelA);
	panel.add(panelB);
	add(panel);
	setVisible(true);
	
	}
    public static void main(String[] args) {
    	시험공부_실습_피자주문화면 f = new 시험공부_실습_피자주문화면();
	
    }
}
