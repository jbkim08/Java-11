package application;

import javax.swing.JFrame;

public class Hello {

	public static void main(String[] args) {
		
		//윈도우창
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(600, 400); //가로세로 사이즈
		//창을 닫으면 프로그램 종료
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);

	}

}
