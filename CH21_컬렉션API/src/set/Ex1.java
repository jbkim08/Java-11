package set;

public class Ex1 {
	public static void main(String[] args) {
		// set 예제 1 : 문자열에서 단어만 빼오기
		String text1 = "Dozens of tanks and self-propelled howitzers that were supposed to be delivered to the Republic of Korea (ROK) Army will be shipped to Poland, according to a lawmaker.\r\n"
				+ "In addition, some howitzers that have already been in operation for years, will also be delivered to the Central European country, raising concerns over a possible weapons shortage in the military.";
		String text2 = "정부가 투기과열지구를 해제하면서 일부 지역에서는 시장이 안정세를 보이고 있지만, 인천 서구 검단신도시에서는 여전히 집값이 하락하고 있다. 2기 신도시인 검단은 각종 개발호재가 맞물리면서 한 때 국민평형(전용면적 84㎡) 분양권이 8억원대에 팔리기도 했지만, 시장이 냉각되면서 최근에는 분양가 수성마저 위태로운 상황이 됐다. 분양가의 두배로 집값이 뛰었다가 다시 반토막이 나는 롤러코스터 시세를 보이고 있다.";
		
		//String[] words = text1.split("[^a-zA-Z]+");
		String[] words = text2.split("[^가-힣]+");
		
		for(String word : words) {
			
			if(word.length() <= 2) continue;
			
			System.out.println(word.toLowerCase()); //소문자로 출력
		}

	}

}
