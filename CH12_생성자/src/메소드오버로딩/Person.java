package 메소드오버로딩;

public class Person {
	//이름은 똑같지만 매개변수가 다르면 다른 메소드 (오버로딩)
	public void greet() {
		System.out.println("헬로우!");
	}
	public void greet(String name) {
		System.out.println("헬로우! " + name);
	}
}
