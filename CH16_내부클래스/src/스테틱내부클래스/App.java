package 스테틱내부클래스;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();		
		p1.print();
		// 내부 클래스
		Person.Head head = p1.new Head();
		head.print();
		// 스테틱 내부 클래스
		Person.Body body = new Person.Body();
		body.print();

	}

}
