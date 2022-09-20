package application;

public class Cat {

	private String name; // 이름
	private int id; // 고양이 아이디(고유, 중복안됨)
	// 클래스명만 가지고 사용 static
	public static final String FOOD = "고양이 사료";
	private static int count = 0; // 스테틱 변수 초기값 0

	public Cat(String name) {
		this.name = name;
		count++; // 객체 생성시 카운트 1증가!
		id = count;
	}

	// 스테틱 메서드는 스테틱 변수만 사용가능
	public static int getCount() {
		return count; // 카운트를 리턴
	}

	@Override
	public String toString() {
		return "Cat [고양이ID: " + id + ", 이름=" + name + "]";
	}

}






