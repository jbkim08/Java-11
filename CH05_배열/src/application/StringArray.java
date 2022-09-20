package application;

public class StringArray {

	public static void main(String[] args) {
		// 문자열 배열
		String[] animals = { "고양이", "개", "펭귄", "사자" };
		
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
		
		//배열의 값을 수정(업데이트)
		animals[0] = "닭";
		System.out.println(animals[0]);
	}

}
