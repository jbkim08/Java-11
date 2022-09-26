package 익명클래스;

public class App {
	
	private String name = "펭수";
	
	public static void main(String[] args) {
		new App().start();
	}

	private void start() {
		//System.out.println(name);	
		Runnable runner = new Runnable() {
			public void run() {
				System.out.println(name);
			}		
		};
		runner.run();
	}

}
