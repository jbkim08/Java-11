package arrayList;

import java.util.ArrayList;

public class App2 {

	public static void main(String[] args) {
		//리스트에 커스텀 타입 객체 입력
		ArrayList<Person> people = new ArrayList<>();
		
		Person p1 = new Person("펭수");
		people.add(p1);
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));
		
		people.forEach(p -> System.out.println(p));
		
		for(Person p : people) {
			System.out.println(p);
		}
	}

}
