package throw예외처리;

public class Thermostat {
	// 메소드에 throw로 예외를 처리했을 경우 이 메소드를 사용할때 예외처리를 한다.
	public void setTemperature(double temp) throws Exception {
		if(temp < 0 || temp > 35) {
			throw new Exception("온도가 비정상!");
		}
		
		System.out.println("온도 세팅 : " + temp);
	}
	
}
