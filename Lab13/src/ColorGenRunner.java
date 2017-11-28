

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ColorGenRunner {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				ColorGen frame = new ColorGen();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}