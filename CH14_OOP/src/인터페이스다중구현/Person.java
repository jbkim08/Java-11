package 인터페이스다중구현;

//인터페이스는 다중구현이 가능
public class Person implements Speaker,Greeter {

	@Override
	public void greet() {
		System.out.println("환영합니다.");
	}

	@Override
	public void speak() {
		System.out.println("나는 person입니다.");
	}

}
