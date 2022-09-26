package 상속인터페이스;

import java.util.ArrayList;

public class MeterExam {
	
	public static void main(String[] args) {
		Taxi taxi = new Taxi();

		taxi.start();
		taxi.stop(2500);
		MeterExam me = new MeterExam();
		ArrayList<String> myStr = new ArrayList<String>();
	}
}


interface Meter {
	public int BASE_FARE = 3000; // 기본요금(인터페이스에 정의한 변수는 상수라서 변경할 수 없습니다.)
	public abstract void start();
	public abstract void stop(int distance);
}

class Taxi implements Meter {
	// Meter인터페이스의 start와 stop메소드를 구현해야 합니다.
	public void start() {
		System.out.println("운행을 시작합니다.");
	}

	public void stop(int distance) {
		int fare = BASE_FARE + distance * 2;
		System.out.println("운행을 종료합니다. 요금은 " + fare + "원 입니다.");
	}
}
