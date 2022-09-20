package 정수;

public class VariableAssignment {

	public static void main(String[] args) {
		// 변수재할당 : 변수는 다른값 입력가능
		int x = 8;
		int y = 3;
		
		System.out.println("1. x: " + x);
		System.out.println("1. y: " + y);
		//변수 값 재할당
		x = y;
		y = 10;
		
		System.out.println("2. x: " + x);
		System.out.println("2. y: " + y);

	}

}
