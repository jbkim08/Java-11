package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public MainFrame(String title) {
		super(title); //창의 제목넣기
								
		setLayout(new BorderLayout());   //보더 레이아웃
		add(new Toolbar(), BorderLayout.NORTH); //툴바를 메인프레임에 붙이기
		add(new MainPanel(), BorderLayout.CENTER); //패널을 메인프레임에 붙이기
				
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
