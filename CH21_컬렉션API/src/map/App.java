package map;

import java.util.HashMap;

public class App {
	public static void main(String[] args) {
		// 해시맵은 키값으로 해당 value값을 가져옴
		HashMap<Integer, String> list = new HashMap<>();

		list.put(0, "펭수");
		list.put(1, "길동");
		list.put(3, "라이언");
		list.put(4, "프레드");
		list.put(4, "마이클"); //키값 중복안되고 같은 키면 값이 업데이트
		list.put(10, "수지");

		System.out.println(list.get(4)); //키값으로 value 가져옴

		list.forEach((k, v) -> System.out.println(k + ": " + v));

		//반복문(람다말고)
		for( String s : list.values()) {
			System.out.println(s);
		}
		for( int n : list.keySet()) {
			System.out.println(n);
		}
	}

}
