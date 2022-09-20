package application;

public class DoWhile {

	public static void main(String[] args) {
		// 조건에 상관없이 처음 한번은 실행
		int count = 100;
		
		do {
			System.out.println("카운트 : " + count);
		} while(count++ < 5);

	}

}
