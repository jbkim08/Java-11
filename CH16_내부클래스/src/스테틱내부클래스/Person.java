package 스테틱내부클래스;

public class Person {

	class Head {
		public void print() {
			System.out.println("헤드");
		}
	}
	
	static class Body {
		public void print() {
			System.out.println("바디");
		}
	}
	
	public void print() {
		//내부클래스를 내부에서 사용할때는 간단하게 사용
		Head head = new Head();
		Body body = new Body();
		
		head.print();
		body.print();
	}
}







