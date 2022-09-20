package 윈도우프로그래밍;

public class App {

	public static void main(String[] args) {
		
		Window win = new Window();
		win.setWidth(300);
		win.setVisible(true); //true로 입력
		
		System.out.println(win.isVisible());
		
	}

}
