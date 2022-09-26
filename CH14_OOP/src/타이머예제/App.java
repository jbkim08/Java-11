package 타이머예제;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		Timer t1 = new Timer();
		Timer t2 = new Timer();
		// 반복적으로 일을 실행한다.(할일,시작시간,반복시간)
		// 시간은 1/1000초 1000ms => 1초
		t1.scheduleAtFixedRate(new MyTask(), 5000, 5000);
		t2.scheduleAtFixedRate(new MyTask2(), 30000, 30000);
				
	}
}

class MyTask extends TimerTask{
	public void run() {
		System.out.println("계란 삶는 중");
	}	
}
class MyTask2 extends TimerTask{
	public void run() {
		JOptionPane.showMessageDialog(null, "계란 삶기 완료");
	}	
}






