package application;

import java.util.Scanner;

public class Scope {

	public static void main(String[] args) {
		// 지역변수 , 전역변수
		
		int value = 7;
		System.out.println("밖에있는v"+value);
		
		{
			//int value = 0; // 지역변수 {}안에서만 가능
			System.out.println("안에있는v"+value);
		}


		// System.out.println(value);

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}		
		
		//System.out.println(i); i는 for문의 지역변수

		String input = null; //전역변수로 do{}안에서 사용가능
		do {
			System.out.println("종료할려면 'stop'입력");
			input = scanner.nextLine();
		} while (!input.equals("stop"));
	}

}
