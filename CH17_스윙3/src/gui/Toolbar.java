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
		
		red.addActionListener(e-> mainPanel.setBackground(Color.RED));

		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setBackground(Color.BLUE);				
			}
		});
		
		add(red);
		add(blue);
	}
}




