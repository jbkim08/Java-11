package 지역내부클래스;

public class App {
	String name;
	
	public App() {
		name = "앨리자베스";
	}

	public static void main(String[] args) {
		App app = new App();
		//System.out.println(app.name);
		app.run();
	}
	
	private void run() {
		//내부클래스는 밖에있는 클래스의 변수를 사용가능
		class Printer {
			public void print() {
				System.out.println(name);
			}
		}
		new Printer().print(); 
	}
}





