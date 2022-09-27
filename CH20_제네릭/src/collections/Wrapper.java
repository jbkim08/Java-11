package collections;

//제네릭 타입 클래스는 클래스명<E> E타입은 모든 타입으로 변환가능
public class Wrapper<E> {
	private E object;

	public E get() {
		return object;
	}

	public void set(E object) {
		this.object = object;
	}
	
	
}
