package week10_액션이벤트_문제만들기;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 시험문제_4_답 extends JFrame implements ActionListener {
    private DefaultTableModel tableModel;
    private JTable gradeTable;
    private JTextField nameField;
    private JTextField scoreField;
    private JButton addButton;
    private JButton calculateButton;
    private JLabel averageLabel;

    public 시험문제_4_답() {
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("학생 성적 처리 프로그램");

        JPanel panel = new JPanel();
        tableModel = new DefaultTableModel(new Object[]{"이름", "성적"}, 0);
        gradeTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(gradeTable);
        nameField = new JTextField(10);
        scoreField = new JTextField(10);
        addButton = new JButton("추가");
        calculateButton = new JButton("평균 계산");
        averageLabel = new JLabel();

        addButton.addActionListener(this);
        calculateButton.addActionListener(this);
        panel.add(scrollPane);
        panel.add(nameField);
        panel.add(scoreField);
        panel.add(addButton);
        panel.add(calculateButton);
        panel.add(averageLabel);
        this.add(panel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String name = nameField.getText();
            String score = scoreField.getText();
            if (!name.isEmpty() && !score.isEmpty()) {
                tableModel.addRow(new Object[]{name, score});
                nameField.setText("");
                scoreField.setText("");
            }
        } else if (e.getSource() == calculateButton) {
            int totalScore = 0;
            int rowCount = tableModel.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                int score = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
                totalScore += score;
            }
            double averageScore = (double) totalScore / rowCount;
            averageLabel.setText("평균 성적: " + averageScore);
        }
    }

    public static void main(String[] args) {
        new 시험문제_4_답();
    }
}
