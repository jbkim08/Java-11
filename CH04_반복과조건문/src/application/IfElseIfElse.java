package application;

import java.util.Scanner;

public class IfElseIfElse {

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
		else if(banana > apple) {
			System.out.println("바나나가 사과보다 많음");
		}
		else {		
			System.out.println("바나나가 사과와 같음!");
		}
		
		System.out.println("프로그램 종료!");

	}

}
