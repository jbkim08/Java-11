package application;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// 입력한 패스워드를 설정 패스워드와 비교
		final String PASS = "1234";
		
		System.out.print("패스워드 입력: ");
		
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		
		if(password.equals(PASS)) {
			System.out.println("접속 승인");
		} else {
			System.out.println("접속 불가");
		}

	}

}
