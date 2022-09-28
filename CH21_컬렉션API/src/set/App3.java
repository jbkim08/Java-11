package set;

import java.util.Set;
import java.util.TreeSet;

public class App3 {
	public static void main(String[] args) {
		// 트리셋 : 중복이 안되며 정렬됨
		Set<String> fruits = new TreeSet<>();
		Set<Integer> list = new TreeSet<>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		list.add(99);
		list.add(1);
		list.add(7);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(88);
		list.add(77);
		list.add(1);
		
		System.out.println(fruits.contains("오렌지"));
		
		fruits.forEach(f -> System.out.println(f));
		list.forEach(n -> System.out.println(n));
	}

}
