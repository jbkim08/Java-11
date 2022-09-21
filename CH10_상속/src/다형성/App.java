package 다형성;

public class App {
	public static void main(String[] args) {

		Cat[] cats = { new HouseCat(), new RoadCat(), new Tiger() };

		for (int i = 0; i < cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		
		for ( Cat cat : cats) {
			cat.vocal();
			cat.hunt();
		}
		
		// 업캐스팅 부모타입으로 선언 (상속필요)
		Cat cat1 = new HouseCat();
		// 다운캐스팅 : 업캐스팅 객체를 다시 다운캐스팅할 수 있다.
		HouseCat cat2 = (HouseCat)cat1;
		

	}

}
