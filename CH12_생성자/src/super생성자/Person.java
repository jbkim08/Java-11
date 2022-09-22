package super생성자;

public class Person {
	
	private String name;
	
	public Person(String name) {
		System.out.println("부모 생성자!");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	

}
