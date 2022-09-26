package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	public Toolbar(MainPanel mainPanel) {
		final JButton red = new JButton("RED");
		final JButton blue = new JButton("BLUE");
		
		red.addActionListener(new ColorListener(mainPanel, Color.RED));
		blue.addActionListener(new ColorListener(mainPanel, Color.BLUE));
		
		add(red);
		add(blue);
	}
}

class ColorListener implements ActionListener {
	private MainPanel mainPanel;
	private Color color;
	
	public ColorListener(MainPanel mainPanel, Color color) {
		this.mainPanel = mainPanel;
		this.color = color;
	}

	public void actionPerformed(ActionEvent e) {
		// 메인패널객체의 주소를 알아야함
		mainPanel.setBackground(color);
	}	
}


