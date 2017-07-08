package hello;

import javax.swing.*;

public class Frame {
	public Frame(String TITLE, int WIDTH, int HIEGHT){
		JFrame frame;

	frame = new JFrame (TITLE);
	frame.setSize(WIDTH, HIEGHT);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	
	frame.add(label);
	frame.setVisible(true);
	}
}
