package getterSetter;

public class Person {
	//다른 클래스에서 접근 불가 private 키워드
	private String name;
	private int age;
	
	//get(값을 리턴) set(값을 입력) 메서드를 통해서만 변수에 접근가능
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name; //이름을 리턴
	}	
	void setAge(int age) {
		this.age = age; //입력된 값으로 나이를 수정
	}
	int getAge() {
		return age;
	}
}
