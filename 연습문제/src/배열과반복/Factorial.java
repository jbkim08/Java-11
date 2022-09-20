package 배열과반복;

public class Factorial {
	public static void main(String[] args) {
		// 입력값 받기
		//int number = Integer.parseInt(args[0]);
		
		// 결과 출력
		printFactorial(4);
	}

	// 정수 n을 입력받아 n!의 결과를 출력
	public static void printFactorial(int n) {
		int result = 1;
		System.out.printf("%d! = ", n);
		for (int i = n; i > 0; i--) {
			System.out.printf("%d", i);
			result *= i; // 해당 라인을 수정하세요.
			if (i != 1) {
				System.out.printf(" x ");
			}
		}
		System.out.printf(" = %d\n", result);
	}
}
