package throw예외처리2;

public class App {

	public static void main(String[] args) {
		
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(25);
		} catch (Exception e) {
			//e.printStackTrace(); //빨간색 에러메세지
			System.out.println(e.getMessage());
		}
		System.out.println("종료!");
	}

}
