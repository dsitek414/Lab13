
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorGen extends JFrame {

	private JPanel colorPanel;
	private int cycNum = 4;
	
	private static final int DEFAULT_WIDTH = 300;
	
	private static final int DEFAULT_HEIGHT = 200;
	
	public ColorGen() {
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		setTitle("Color Cycler");
		
		JButton changeButton = new JButton("Change");
		JButton resetButton = new JButton("Reset");
		JButton closeButton = new JButton("Close");
		
		colorPanel = new JPanel();
		
		colorPanel.add(changeButton);
		colorPanel.add(resetButton);
		colorPanel.add(closeButton);
		
		add(colorPanel);
		
		ColorChange colorCycle = new ColorChange();
		ResetColors reset = new ResetColors();
		CloseWindow closer = new CloseWindow();
		
		changeButton.addActionListener(colorCycle);
		resetButton.addActionListener(reset);
		closeButton.addActionListener(closer);
	}
	
	
	private class ColorChange implements ActionListener
	{
		
		public void actionPerformed(ActionEvent event)
		{
			if (cycNum % 4 == 0) {
				colorPanel.setBackground(Color.BLACK);
				cycNum++;
			} else if (cycNum % 4 == 1) {
				colorPanel.setBackground(Color.GREEN);
				cycNum++;
			} else if (cycNum % 4 == 2) {
				colorPanel.setBackground(Color.ORANGE);
				cycNum++;
			} else if (cycNum % 4 == 3) {
				colorPanel.setBackground(Color.PINK);
				cycNum++;
			}
		}
	}
	
	private class ResetColors implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			colorPanel.setBackground(Color.BLACK);
			cycNum = 5;
		}
	}
	
	private class CloseWindow implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.exit(0);
		}
	}
}