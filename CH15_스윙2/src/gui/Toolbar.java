package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	public Toolbar() {
		final JButton red = new JButton("RED");
		final JButton blue = new JButton("BLUE");
		
		red.addActionListener(new RedListener());
		
		add(red);
		add(blue);
	}
}

class RedListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		// 여기에 만든 코드가 버튼을 누르면 실행됨	
		System.out.println("빨간버튼 눌렀음!");
	}	
}



