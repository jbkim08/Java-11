package application;

public class PrintF {

	public static void main(String[] args) {

		int age = 25;
		String addr = "부산";

		System.out.print("붙여적기");
		System.out.print("붙여적기");
		System.out.print("붙여적기");
		System.out.println();
		System.out.printf("내 나이는 %d살 입니다.\n", age);
		System.out.printf("내 나이는 %d살이고 %s에 살고 있음\n", age, addr);

		double pi = 3.14;
		System.out.printf("파이의 값은 : %.2f", pi);
	}
}
