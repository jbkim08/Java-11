package 오버라이딩메소드;

public class App {

	public static void main(String[] args) {
		
		HouseCat cat1 = new HouseCat();
		cat1.vocal(); //부모의 울음소리 야옹~을 미야우~~ 오버라이드(업데이트)
		cat1.hunt();
		
		RoadCat cat2 = new RoadCat();
		cat2.vocal();
		cat2.hunt();
		
		Tiger cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();

	}

}
