package this생성자;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		this("모름",0);
		System.out.println("디폴트 생성자로 생성!");	
	}
	public Person(String name) {
		this(name, 0);
		System.out.println("생성자 1 생성!");
	}

	public Person(String name, int age) {
		System.out.println("생성자 2 생성!");
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

}
