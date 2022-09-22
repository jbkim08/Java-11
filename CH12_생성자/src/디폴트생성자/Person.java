package 디폴트생성자;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		System.out.println("디폴트 생성자로 생성!");
		name = "모름";
		age = 0;
	}
	public Person(String name) {
		System.out.println("person객체 생성!");
		this.name = name;
		age = 0;
	}

	public Person(String name, int age) {
		System.out.println("person객체 생성!");
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

}
