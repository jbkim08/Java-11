package application;

public class RandomWord {

	private String books = "television assignment situation significance application agreement reception medicine permission profession attention government activity software classroom protection insurance reflection republic construction chocolate homework possession emphasis direction atmosphere refrigerator judgment percentage temperature";
	private String[] words = books.split(" "); //문자열에서 스페이스로 분리한 단어들
	private String selectWord; //랜덤으로 선택 단어
	
	public RandomWord() {
		// 객체를 생성하면 랜덤 단어 하나 선택
		selectWord = words[1];
	}
	
	public String toString() {
		return selectWord; //선택단어 리턴
	}
	
	//모든 단어를 출력하는 메소드
	public void getWords() {
		for(String w : words) {
			System.out.println(w);
		}
	}
}
