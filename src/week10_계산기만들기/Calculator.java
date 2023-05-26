package week10_계산기만들기;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

    private JTextField field; // 입력창에 해당하는 필드
    private double result; // 계산 결과를 저장하는 변수
    private String operator; // 현재 선택된 연산자를 저장하는 변수

    public Calculator() {
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 전체 패널을 BorderLayout으로 설정
        JPanel panel = new JPanel(new BorderLayout());
        add(panel);

        // 입력
        field = new JTextField(30);
        panel.add(field, BorderLayout.NORTH);

        // 버튼
        JPanel button = new JPanel(new GridLayout(0, 5, 5, 5));
        panel.add(button, BorderLayout.CENTER);

        button.add(createButton("BackSpace"));
        button.add(createButton(""));
        button.add(createButton(""));
        button.add(createButton("CE"));
        button.add(createButton("C"));
        button.add(createButton("7"));
        button.add(createButton("8"));
        button.add(createButton("9"));
        button.add(createButton("/"));
        button.add(createButton("sqrt"));
        button.add(createButton("4"));
        button.add(createButton("5"));
        button.add(createButton("6"));
        button.add(createButton("x"));
        button.add(createButton("%"));
        button.add(createButton("1"));
        button.add(createButton("2"));
        button.add(createButton("3"));
        button.add(createButton("-"));
        button.add(createButton("1/x"));
        button.add(createButton("0"));
        button.add(createButton("+/-"));
        button.add(createButton("."));
        button.add(createButton("."));
        button.add(createButton("="));

        pack();
        setVisible(true);
    }

    // 버튼 생성 및 ActionListener 등록을 동시에 수행하는 메서드
    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.addActionListener(new ButtonClickListener());
        return button;
    }

    // 버튼 클릭 이벤트 처리를 위한 ActionListener 구현
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();
            switch (command) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    field.setText(field.getText() + command); // 입력 필드에 숫자 추가
                    break;
                case "+":
                    performAddition();
                    break;
                case "-":
                    performSubtraction();
                    break;
                case "/":
                    performDivision();
                    break;
                case "%":
                    performModulo();
                    break;
                case "x":
                    performMultiplication();
                    break;
                case "=":
                    performEquals();
                    break;
                case "C":
                    field.setText(""); // 입력 필드를 비움
                    result = 0; // 결과 초기화
                    operator = null; // 연산자 초기화
                    break;
                case "sqrt":
                    performSquareRoot();
                    break;
            }
        }

        private void performAddition() {
            String input = field.getText(); // 입력 필드의 내용을 가져옴
            if (!input.isEmpty()) {
                double number = Double.parseDouble(input); // 입력된 숫자로 변환
                result += number; // 현재 결과에 숫자를 더함
                field.setText(""); // 입력 필드를 비움
            }
            operator = "+"; // 현재 연산자를 저장
        }

        private void performSubtraction() {
            String input = field.getText(); // 입력 필드의 내용을 가져옴
            if (!input.isEmpty()) {
                double number = Double.parseDouble(input); // 입력된 숫자로 변환
                if (result == 0) {
                    result = number; // 이전 결과가 0이면 첫 번째 입력 숫자로 설정
                } else {
                    result -= number; // 현재 결과에서 숫자를 뺌
                }
                field.setText(""); // 입력 필드를 비움
            }
            operator = "-"; // 현재 연산자를 저장
        }

        private void performDivision() {
            String input = field.getText(); // 입력 필드의 내용을 가져옴
            if (!input.isEmpty()) {
                double number = Double.parseDouble(input); // 입력된 숫자로 변환
                if (result == 0) {
                    result = number; // 이전 결과가 0이면 첫 번째 입력 숫자로 설정
                } else {
                    result /= number; // 현재 결과를 숫자로 나눔
                }
                field.setText(""); // 입력 필드를 비움
            }
            operator = "/"; // 현재 연산자를 저장
        }

        private void performModulo() {
            String input = field.getText(); // 입력 필드의 내용을 가져옴
            if (!input.isEmpty()) {
                double number = Double.parseDouble(input); // 입력된 숫자로 변환
                if (result == 0) {
                    result = number; // 이전 결과가 0이면 첫 번째 입력 숫자로 설정
                } else {
                    result %= number; // 현재 결과를 숫자로 나눈 나머지 계산
                }
                field.setText(""); // 입력 필드를 비움
            }
            operator = "%"; // 현재 연산자를 저장
        }

        private void performMultiplication() {
            String input = field.getText(); // 입력 필드의 내용을 가져옴
            if (!input.isEmpty()) {
                double number = Double.parseDouble(input); // 입력된 숫자로 변환
                if (result == 0) {
                    result = number; // 이전 결과가 0이면 첫 번째 입력 숫자로 설정
                } else {
                    result *= number; // 현재 결과에 숫자를 곱함
                }
                field.setText(""); // 입력 필드를 비움
            }
            operator = "x"; // 현재 연산자를 저장
        }

        private void performEquals() {
            if (operator != null) {
                String input = field.getText(); // 입력 필드의 내용을 가져옴
                if (!input.isEmpty()) {
                    double number = Double.parseDouble(input); // 입력된 숫자로 변환
                    switch (operator) {
                        case "+":
                            result += number; // 덧셈 연산 처리
                            break;
                        case "-":
                            result -= number; // 뺄셈 연산 처리
                            break;
                        case "/":
                            if (number != 0) {
                                result /= number; // 나눗셈 연산 처리 (0으로 나누는 경우 제외)
                            } else {
                                field.setText("Error"); // 0으로 나누는 경우 에러 메시지 표시
                                return;
                            }
                            break;
                        case "%":
                            result %= number; // 나머지 연산 처리
                            break;
                    }
                }
                field.setText(String.valueOf(result)); // 결과를 입력 필드에 표시
                operator = null; // 연산자 초기화
            }
        }

        private void performSquareRoot() {
            String input = field.getText(); // 입력 필드의 내용을 가져옴
            if (!input.isEmpty()) {
                double number = Double.parseDouble(input); // 입력된 숫자로 변환
                double squareRoot = Math.sqrt(number); // 루트 계산
                field.setText(String.valueOf(squareRoot)); // 계산 결과를 입력 필드에 표시
            }
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}
