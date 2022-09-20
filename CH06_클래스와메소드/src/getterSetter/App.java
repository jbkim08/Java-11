package getterSetter;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("길동");
		p1.setAge(27);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}
}
