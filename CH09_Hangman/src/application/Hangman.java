package application;

public class Hangman {
	
	private boolean running = false;
	
	//전체 프로그램 실행 메소드
	public void run() {
		do {
			displayWord(); //화면에 단어표시
			getUserInput(); //철자 맞추기
			checkInput(); //맞는지 체크 (다맞으면 running=false)
		} while (running);
	}
	
	private void displayWord() {
		//System.out.println("체크");	
		RandomWord randomWord = new RandomWord();
		System.out.println(randomWord.toString());
	}

	private void getUserInput() {
		System.out.println("단어맞추기");		
	}
	
	private void checkInput() {
		System.out.println("단어확인 및 종료");		
	}



}
