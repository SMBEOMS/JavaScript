package week06_인터페이스를_자료형_1초마다_beep출력;

import java.awt.event.*;
import javax.swing.Timer;

public class CallbackTest {

	public static void main(String[] args) {
		ActionListener listener = new MyClass();
		Timer t =new Timer(1000,listener);
		
		t.start();
		for(int i = 0 ; i<1000; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) 
			{
				
			}
		}

	}

}
