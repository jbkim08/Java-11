package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// 패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다.
		// 패스워드가 맞으면 ﻿맞으면 '접속승인' 출력하고 반복문을 빠져나옴
        // 패스워드 3회 틀릴시 '접속거부'
		final String PASS = "1234";				
		Scanner scanner = new Scanner(System.in);
		
		boolean accessOK = false; //맞췄을때 true
		String password = null;	
		
		for(int i=1; i <= 3; i++) {
			System.out.print("비밀번호 입력: ");
			password = scanner.nextLine();
			if(password.equals(PASS)) {
				System.out.println("접속승인");
				accessOK = true;
				break;
			} else {
				System.out.println("비번이 틀렸습니다.");
			}
		}
		
		if(accessOK == false) {
			System.out.println("접속거부");
		}

	}

}
