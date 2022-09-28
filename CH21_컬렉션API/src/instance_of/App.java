package instance_of;

class Creature {
	//부모클래스
}
class Cat extends Creature{
	//자식클래스
}
public class App {
	public static void main(String[] args) {
		// instanceof 객체의 타입이 맞으면 true
		Creature c1 = new Creature();
		Creature c2 = new Cat();
		
		System.out.println(c1 instanceof Object);
		System.out.println(c1 instanceof Creature);
		System.out.println(c1 instanceof Cat);
		System.out.println("Cat의 객체는?");
		System.out.println(c2 instanceof Object);
		System.out.println(c2 instanceof Creature);
		System.out.println(c2 instanceof Cat);
	}

}



