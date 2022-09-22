package super생성자;

public class Employee extends Person {

	public Employee(String name) {
		super(name);
		System.out.println("직원 생성자!");
	}
}
