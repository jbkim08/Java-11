package arrayList;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		//add메소드로 리스트의 타입 값을 입력
		list.add(7);
		list.add(9);
		list.add(123);
		list2.add("문자열1");
		list2.add("문자열2");
		list2.add("문자열3");
		//값을 가져올때는 인덱스 번호 0번부터~
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		list2.forEach(s -> System.out.println(s));

	}

}
