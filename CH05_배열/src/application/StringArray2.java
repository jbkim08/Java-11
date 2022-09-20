package application;

public class StringArray2 {

	public static void main(String[] args) {
		// 문자열은 클래스타입 => 참조변수 (주소를 가짐)
		int x = 10; 
		String s = "문자열";
		System.out.println(s);
		int[] arr = {1,2,3,4,5,6,7}; //new Int[7];
		String text = new String("헬로우");
		// null은 주소가 없다는 뜻
		s = null;
		arr = null;
		
		String[] texts = null; //실제 배열은 만들어지지 않음
		System.out.println(texts);
		texts = new String[3]; //문자열 배열(3) 생성
		System.out.println(texts);
		
		System.out.println();
		
		texts[0] = new String("하이");
		texts[1] = "안 녕 ?";
		texts[2] = "굿 바이!";
		
		for(String word: texts) {
			System.out.println(word);
		}
	}

}
