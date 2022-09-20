package app;

// 파일 이름과 같은 클래스 (public)
public class ClassObject {
	
	public static void main(String[] args) {
		// 클래스는 설계도로 실제 사용가능한 객체를 생성
		Person p1 = new Person(); //new키워드로 메모리에 person객체 생성
		p1.name = "펭수";
		p1.age = 7;
		Person p2 = new Person(); //new키워드로 메모리에 person객체 생성
		p2.name = "길동";
		p2.age = 17;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
	}

}
