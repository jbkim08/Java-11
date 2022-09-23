package 인터페이스상속;

public class Machine implements DefaultRunnable{

	@Override
	public void run() {
		System.out.println("머신 러닝!");
	}

	@Override
	public void displayDetails() {
		System.out.println("표시할 디테일 없음");
	}

}
