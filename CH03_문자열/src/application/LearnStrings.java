package application;

public class LearnStrings {
	public static void main(String[] args) {
		// 문자열 메소드(함수)
		String myText = " ";
		// empty는 문자열이 없을때, blank는 공백제외 없을때 
		System.out.println(myText.isEmpty());
		System.out.println(myText.isBlank());
		
		//교체하기
		myText = "아침밥을 맛있께 먹었다.";
		System.out.println(myText.replace("아침", "저녁"));
		
		//공백제거
		String name = "   제인  ";
		System.out.printf("'%s'", name);
		System.out.printf("'%s'", name.strip());
		System.out.printf("'%s'", name.trim());
		
		//인덱스 번호
		myText = "abcdefg";
		System.out.println(myText.charAt(0));
		System.out.println(myText.charAt(1));
		System.out.println(myText.charAt(2));
		System.out.println(myText.charAt(3));
		System.out.println(myText.charAt(4));
		System.out.println(myText.charAt(5));
		System.out.println(myText.charAt(6));
		
		//문자열 비교 (알파벳 순으로 첫번째 단어가 더 크면 양수 아니면 음수)
		String w1 = "apple";
		String w2 = "appli";
		
		System.out.println(w1.compareTo(w2));
		
		//문자열을 포함하고 있는지? 있으면 참 없으면 거짓
		myText = "오늘 점심은 돈까스다.!";
		System.out.println(myText.contains("돈까스"));
		
		//문자열 합침 메소드
		String s1 = "첫번째 문장";
		String s2 = "두번째 문장";
		
		System.out.println(s1.concat(s2));
		
		//문자열 포맷(출력안됨)
		String total = String.format("%s %s %d %f", s1, s2, 7, 3.14);
		System.out.println(total);
	}

}
