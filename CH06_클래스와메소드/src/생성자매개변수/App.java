package 생성자매개변수;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person("길동", 30);
		Person p2 = new Person("펭수", 7);
		Person p3 = new Person("라이언", 26);
		Person p4 = new Person(); //기본생성자로 객체 생성
				
		p2.setAge(17);

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());

	}

}
