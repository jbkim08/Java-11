package application;

public class App {

	public static void main(String[] args) {
		
		//스테틱 상수(변수)는 객체없이 사용
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		
		System.out.println("카운트 : " + Cat.getCount());
		
		Cat c1 = new Cat("마틸다");
		System.out.println("카운트 : " + Cat.getCount());
		Cat c2 = new Cat("라이언");
		System.out.println("카운트 : " + Cat.getCount());
		Cat c3 = new Cat("울버린");
		System.out.println("카운트 : " + Cat.getCount());
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		sayHi();
	}

	 static void sayHi() {
		System.out.println("하이!");
	}
}







