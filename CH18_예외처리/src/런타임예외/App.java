package 런타임예외;

public class App {

	public static void main(String[] args) {
		
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(60);
		} catch (Exception e) {
			//e.printStackTrace(); //빨간색 에러메세지
			System.out.println(e.getMessage());
		}
		System.out.println("종료!");
	}

}
