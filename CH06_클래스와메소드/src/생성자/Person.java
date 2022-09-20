package 생성자;

public class Person {

	private String name;
	private int age;
	
	// 생성자는 객체를 만들때 사용(기본은 생략됨)
	public Person() {
		name = "익명";
		age = 20;
		// 생성자는 리턴타입이 없고 클래스명과 같음
		// 기본생성자는 생략가능 매개변수가 없음
		System.out.println("person 객체를 생성!");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
