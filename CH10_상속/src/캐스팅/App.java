package 캐스팅;

public class App {
	public static void main(String[] args) {
		//클래스 타입이 형 변환 ( 업 /다운 캐스팅 )
		Cat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();
		//cat1.call(); 실제 객체는 HouseCat인데 Cat타입이므로
		//Cat의 메서드만 사용가능
		
		HouseCat cat2 = (HouseCat)cat1;
		cat2.call();
	}

}
