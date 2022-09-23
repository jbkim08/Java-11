package 인터페이스;

//인터페이스 구현은 implements
public class Person implements Describable{

	@Override
	public String getDescription() {
		return "Person입니다";
	}

}
