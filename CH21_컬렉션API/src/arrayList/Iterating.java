package arrayList;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Iterating {
	public static void main(String[] args) {
		// 반복문 사용하기
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(9);
		list.add(123);
		// 1
		for (Integer n : list) {
			System.out.println(n);
		}
		System.out.println();
		// 2 인덱스 번호를 함께쓸때
		for (int i = 0; i < list.size(); i++) {
			int n = list.get(i);

			System.out.println(i + ": " + n);
		}
		System.out.println();
		// 3 람다식
		list.forEach(n -> System.out.println(n));
	}

}
