package application;

import collections.Wrapper;
import 계층.Cat;
import 계층.Mammal;

public class App {
	public static void main(String[] args) {
		Wrapper<Cat> wrapper = new Wrapper<>();		
		Cat cat = new Cat("마틸다"); 		
		wrapper.set(cat); //Cat 객체를 object 타입에 입력		
		Cat cat2 = wrapper.get(); //다시 Cat 타입으로		
		System.out.println(cat2);
		
		Wrapper<Mammal> wrapper2 = new Wrapper<>();
		Mammal m1 = new Mammal("포유류");
		wrapper2.set(m1);
		Mammal m2 = wrapper2.get();
		System.out.println(m2);
		
		
	}

}
