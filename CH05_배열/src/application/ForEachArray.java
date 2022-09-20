package application;

public class ForEachArray {

	public static void main(String[] args) {
		// 배엘에 for each 반복문
		String[] fruits = { "바나나", "사과", "수박" };

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		//for each 반복문=> (하나의 아이템 :배열)
		for (String f : fruits) {
			System.out.println(f);
		}

	}

}
