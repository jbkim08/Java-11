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
		//유저가 단어를 다 맞췄는지 체크해서 게임을 종료
		//게임 종료 확인을 하는 메소드 isCompleted 를 RandomWord 클래스에 만들기
		if(randomWord.isCompleted()) {
			System.out.println("잘 맞췄습니다!");
			System.out.println("정답은 : " + randomWord);
			running = false; //반복문 종료
		}
	}

	public void close() {
		scanner.close(); //게임이 끝나면 스캐너 닫기
	}
}






