package application;

public class PreAndPost {

	public static void main(String[] args) {
		// 증감연산자 위치 전 후
		int cat = 5;
		System.out.println(cat++); //5
		System.out.println(cat);   //6
		
		int dog = 3;
		System.out.println(++dog); //4
		System.out.println(dog);   //4
		
		int chicken = 10;
		
		int animal = cat + chicken++;
		System.out.println(animal); //16
		
		int apple = 5;
		int banana = 4;
		
		int fruit = ++apple + banana++;
		System.out.println(fruit); // 10
		

	}

}
