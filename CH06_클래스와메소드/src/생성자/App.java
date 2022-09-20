package 생성자;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		p2.setName("길동");
		p2.setAge(30);
		Person p3 = new Person();
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		System.out.println(p2.getName());
		System.out.println(p2.getAge());

		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		

	}

}
