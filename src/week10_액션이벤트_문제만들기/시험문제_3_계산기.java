package week10_액션이벤트_문제만들기;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 시험문제_3_계산기 extends JFrame implements ActionListener {
    private JTextField numberField1;
    private JTextField numberField2;
    private JComboBox<String> operatorCombo;
    private JButton calculateButton;
    private JLabel resultLabel;

    public 시험문제_3_계산기() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("계산기 애플리케이션");

        JPanel panel = new JPanel();
        numberField1 = new JTextField(10);
        numberField2 = new JTextField(10);
        operatorCombo = new JComboBox<>(new String[]{"+", "-", "*", "/"});
        calculateButton = new JButton("계산");
        resultLabel = new JLabel();

        calculateButton.addActionListener(this);
        panel.add(numberField1);
        panel.add(operatorCombo);
        panel.add(numberField2);
        panel.add(calculateButton);
        panel.add(resultLabel);
        this.add(panel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                int number1 = Integer.parseInt(numberField1.getText());
                int number2 = Integer.parseInt(numberField2.getText());
                String operator = (String) operatorCombo.getSelectedItem();
                int result = 0;
                switch (operator) {
                    case "+":
                        result = number1 + number2;
                        break;
                    case "-":
                        result = number1 - number2;
                        break;
                    case "*":
                        result = number1 * number2;
                        break;
                    case "/":
                        result = number1 / number2;
                        break;
                }
                resultLabel.setText(number1 + " " + operator + " " + number2 + " = " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("숫자를 올바르게 입력해주세요.");
            } catch (ArithmeticException ex) {
                resultLabel.setText("0으로 나눌 수 없습니다.");
            }
        }
    }

    public static void main(String[] args) {
        new 시험문제_3_계산기();
    }
}
