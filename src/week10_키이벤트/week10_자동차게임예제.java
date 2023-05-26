package week10_키이벤트;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class week10_자동차게임예제 extends JPanel implements KeyListener {
    private int img_x = 100;
    private int img_y = 100;
    private Image img;

    public week10_자동차게임예제() {
        setPreferredSize(new Dimension(400, 400));
        addKeyListener(this);
        setFocusable(true);
        
        try {
            img = ImageIO.read(new File("C:\\Images\\임종성.gif"));
        } catch (IOException e) {
            System.out.println("Failed to load image");
            System.exit(1);
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, img_x, img_y, null);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        int distance = 10; // 이동 거리 설정

        if (keyCode == KeyEvent.VK_UP) {
            img_y -= distance;
        } else if (keyCode == KeyEvent.VK_DOWN) {
            img_y += distance;
        } else if (keyCode == KeyEvent.VK_LEFT) {
            img_x -= distance;
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            img_x += distance;
        }

        repaint(); // 화면 갱신
    }

    public void keyReleased(KeyEvent e) {
        // 키를 떼었을 때 필요한 동작을 추가할 수 있습니다.
    }

    public void keyTyped(KeyEvent e) {
        // 키를 타이핑했을 때 필요한 동작을 추가할 수 있습니다.
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Car Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new week10_자동차게임예제());
        frame.pack();
        frame.setVisible(true);
    }
}
