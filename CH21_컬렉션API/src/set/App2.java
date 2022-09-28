package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class App2 {
	public static void main(String[] args) {
		// 링크드 해시셋 : 중복이 안되며 순서가 있다.(인덱스는 없음)
		HashSet<String> fruits = new LinkedHashSet<>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		System.out.println(fruits.contains("오렌지"));
		
		fruits.forEach(f -> System.out.println(f));
	}

}
