package application;

import java.util.Scanner;

public class CheckPassDoWhile {

	public static void main(String[] args) {
		// 입력한 패스워드를 설정 패스워드와 비교
		final String PASS = "1234";				
		Scanner scanner = new Scanner(System.in);
		
		String password = null;		
		do {
			System.out.print("패스워드 : ");
			password = scanner.nextLine();
		} while (!password.equals(PASS));
		
		System.out.println("접속 승인");	
	}

}
