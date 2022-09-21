package application;

import java.util.Scanner;

public class Hangman {
	
	private boolean running = true;
	private RandomWord randomWord = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	
	//전체 프로그램 실행 메소드
	public void run() {
		do {
			displayWord(); //화면에 단어표시
			getUserInput(); //철자 맞추기
			checkInput(); //맞는지 체크 (다맞으면 running=false)
		} while (running);
	}
	
	private void displayWord() {	
		System.out.println(randomWord);
	}

	private void getUserInput() {
		//유저에게 한 문자 입력 요구
		//입력받은 문자열에서 한 문자를 뽑아서 
		//RandomWord 클래스에 전달 ( addGuess(문자) 메소드를 만들자 )
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine();
		char ch = guess.charAt(0);
		randomWord.addGuess(ch); //랜덤워드에서 문자가 맞으면 배열에 입력
	}
	
	private void checkInput() {
		System.out.println("단어확인 및 종료");		
	}



}
