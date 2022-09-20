package school;

public class Student {

	private String name;
	private int age;
	private boolean isVisible; // 출석 true , 미출석 false
	private double temperature; //온도검사
	
	//생성자 모든 매개변수 입력시
	public Student(String name, int age, boolean isVisible, double temperature) {
		super();
		this.name = name;
		this.age = age;
		this.isVisible = isVisible;
		this.temperature = temperature;
	}

	//get set 메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", isVisible=" + isVisible + ", temperature=" + temperature
				+ "]";
	}
	
}
