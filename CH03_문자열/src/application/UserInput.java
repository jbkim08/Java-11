package application;

import java.util.Scanner; //스캐너 클래스를 사용하기 위해 불러옴

public class UserInput {

	public static void main(String[] args) {
		
		//스캐너 객체 만들기
		Scanner scanner = new Scanner(System.in);
		System.out.print("섭씨 온도 입력 : ");
		double input = scanner.nextDouble();
		
		double f = (input * 9 / 5) + 32; // 화씨 (변환공식)

		System.out.println("섭씨 " + input + "는 화씨 " + f +"이다.");
	}

}
