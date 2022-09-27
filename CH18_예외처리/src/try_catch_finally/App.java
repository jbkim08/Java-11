package try_catch_finally;

public class App {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		try {
			p1.setName("철수");
			//여기코드는 예외 발생시 실행안됨
		} catch (Exception e) {
			//여기코드는 예외가 발생해야 실행됨
			System.out.println(e.getMessage());
		} finally {
			//무조건 실행되는 코드는 여기에!
			System.out.println("final 무조건 실행");
		}
		
		System.out.println("프로그램 종료");

	}

}
