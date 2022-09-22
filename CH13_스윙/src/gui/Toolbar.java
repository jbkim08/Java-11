package gui;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	public Toolbar() {
		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
	}

}
