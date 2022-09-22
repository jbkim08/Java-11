package this생성자;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1);
		Person p2 = new Person("홍길동");		
		System.out.println(p2);
		Person p3 = new Person("펭수", 17);		
		System.out.println(p3);
	}

}




