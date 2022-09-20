package school;

public class App {

	public static void main(String[] args) {
		
		Student s1 = new Student("철수", 30, true, 27.5);
		Student s2 = new Student("펭수", 10, false, 0);
		Student s3 = new Student("라이언", 25, true, 26.5);
		Student s4 = new Student("영희", 20, true, 27.0);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}
