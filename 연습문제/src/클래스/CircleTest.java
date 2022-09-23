package 클래스;

public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle(4);
		//c.radius = 4;
		System.out.printf("반지름이  %d인 원의 넓이: %.2f", c.radius, c.area());
	}
}

/* 4. 원 클래스 구현 */
class Circle {
	int radius; 	// 반지름
	public Circle(int radius) {
		this.radius = radius;
	}
	double area() { //원의 넓이
		return radius * radius * Math.PI;
	}
}
