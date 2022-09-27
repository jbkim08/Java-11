package application;

import collections.Pair;
import 계층.Cat;

public class App2 {

	public static void main(String[] args) {
		// Integer 정수 int의 클래스형
		Pair<Integer, Cat> pair = new Pair<>(1, new Cat("마틸다"));
		
		System.out.println(pair);
		System.out.println(pair.getOne());
		System.out.println(pair.getTwo());

	}

}
