package application;

public class LoopArray {

	public static void main(String[] args) {
		// 문자열 배열
		String[] animals = { "고양이", "개", "펭귄", "사자" };

		// 반복문으로 배열의 모든 아이템을 출력한다.
		for (int i = 0; i < animals.length; i++) {
			System.out.printf("인덱스 %d : %s \n", i, animals[i]);
		}
	}

}
