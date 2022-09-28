package 리스트;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<>();

		numbers.add(5);
		numbers.add(7);
		numbers.add(8);
		
		//리스트의 아이템들을 한줄씩 출력
		displayList(numbers);	
		
		List<Integer> list = new ArrayList<>();
		list.addAll(numbers);
		list.add(9);
		list.add(10);
		System.out.println("0번째아이템 "+list.get(0));
		
		list.remove(0);	//아이템 삭제 (인덱스번호)	
		
		displayList(list);	
		
	}

	private static void displayList(List<Integer> list) {
		list.forEach(n -> System.out.println(n));
	}

}





