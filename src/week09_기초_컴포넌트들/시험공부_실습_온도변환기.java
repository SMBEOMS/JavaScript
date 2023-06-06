package week09_기초_컴포넌트들;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 시험공부_실습_온도변환기 {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel panel = new JPanel();
        f.add(panel);

        JLabel label1 = new JLabel("화씨 온도");
        JLabel label2 = new JLabel("섭씨 온도");
        JTextField field1 = new JTextField(20);
        JTextField field2 = new JTextField(20);
        JButton button = new JButton("변환");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fahrenheitText = field1.getText();
                if (!fahrenheitText.isEmpty()) {
                    double fahrenheit = Double.parseDouble(fahrenheitText);
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    field2.setText(String.format("%.2f"+ "℃", celsius));
                }
            }
        });

        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(button);

        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("온도변환기");
        f.setVisible(true);
    }

}
