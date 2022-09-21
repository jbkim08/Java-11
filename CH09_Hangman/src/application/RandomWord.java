package application;

import java.util.Random;

public class RandomWord {

	private String books = "television assignment situation significance application agreement reception medicine permission profession attention government activity software classroom protection insurance reflection republic construction chocolate homework possession emphasis direction atmosphere refrigerator judgment percentage temperature";
	private String[] words = books.split(" "); // 문자열에서 스페이스로 분리한 단어들
	private String selectWord; // 랜덤으로 선택 단어
	private Random random = new Random();
	private char[] characters;

	public RandomWord() {
		// 객체를 생성하면 랜덤 단어 하나 선택
		int index = random.nextInt(words.length); // 단어의 갯수만큼 랜덤으로 나온 인덱스번호
		selectWord = words[index];
		characters = new char[selectWord.length()];// 선택단어의 갯수만큼크기배열
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (char c : characters) {
			// 예제 삼항조건연산자를 써서 한줄로 줄이기
			sb.append((c == '\u0000') ? '_' : c);
			sb.append(' ');
		}
		// System.out.println(selectWord);
		return sb.toString(); // 선택단어를 _로리턴
	}

	// 모든 단어를 출력하는 메소드
	public void getWords() {
		for (String w : words) {
			System.out.println(w);
		}
	}

	public void addGuess(char c) {
		// 랜덤으로 선택한 단어에 c 문자가 있으면
		// 그 문자를 characters의 인덱스 위치에 입력
		for (int i = 0; i < selectWord.length(); i++) {
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}

	}
}
