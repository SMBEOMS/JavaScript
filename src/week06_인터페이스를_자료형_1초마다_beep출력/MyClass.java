package week06_인터페이스를_자료형_1초마다_beep출력;

import java.awt.event.*;

public class MyClass implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("beep");
	}
}
