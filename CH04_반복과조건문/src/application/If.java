package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// if 조건문		
		Scanner scanner = new Scanner(System.in);
		System.out.print("사과의 갯수는 ?");
		int apple = scanner.nextInt();
		System.out.print("바나나의 갯수는 ?");
		int banana = scanner.nextInt();
		
		if(apple > banana) {
			System.out.println("사과가 바나나보다 많음");
		}
		if(apple < banana) {
			System.out.println("바나나가 사과보다 많음");
		}
		
		System.out.println("프로그램 종료!");

	}

}
