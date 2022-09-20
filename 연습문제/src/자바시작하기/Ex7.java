package 자바시작하기;

import java.util.Scanner; //스캐너 클래스및 패키지를 불러옴

public class Ex7 {
	
	public static void main(String[] args) {
		//콘솔에서 값을 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int a = scanner.nextInt();
		
		System.out.println(a);
	}
}
