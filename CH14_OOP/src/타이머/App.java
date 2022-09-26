package 타이머;

import java.util.Timer;
import java.util.TimerTask;

public class App {
	public static void main(String[] args) {
		Timer timer = new Timer();
		// 반복적으로 일을 실행한다.(할일,시작시간,반복시간)
		// 시간은 1/1000초 1000ms => 1초
		timer.scheduleAtFixedRate(new MyTask(), 0, 1000);
		
	}
}

class MyTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("헬로우!");
	}
	
}






