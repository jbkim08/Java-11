package 계층;

public class Creature {
	private String name;
	
	public Creature(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public void feed() {
		System.out.println("밥을 먹는다.");
	}
}
