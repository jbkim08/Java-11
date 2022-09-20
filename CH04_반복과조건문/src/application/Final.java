package application;

public class Final {

	public static void main(String[] args) {
		// final 상수
		final int x = 9;
		//x = 10; 상수는 값을 다시 할당할수 없다.
		final String PASS = "abcd";
		// PASS = "1234"; 변경할수 없음
		
		System.out.println(x);
		System.out.println(PASS);
	}

}


