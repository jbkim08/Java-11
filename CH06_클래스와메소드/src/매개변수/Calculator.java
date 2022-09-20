package 매개변수;

public class Calculator {
	//정수리턴하고 매개변수 x입력
	int square(int x) {
		return x*x; //입력된 x값을 제곱해서 리턴함
	}
	//두개의 정수를 입력받아 더한값을 리턴
	int plus(int x, int y) {
		return x + y;
	}
	//두개의 정수를 입력받아 앞의값에 뒤의값을 빼서 리턴
	int minus(int x, int y) {
		return x - y;
	}
}
