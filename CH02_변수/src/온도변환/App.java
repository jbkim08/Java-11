package 온도변환;

public class App {

	public static void main(String[] args) {
		// (0°C × 9/5) + 32 = 32°F
		double c = 25; // 섭씨
		double f = (c * 9 / 5) + 32; // 화씨 (변환공식)

		System.out.println("섭씨 " + c + "는 화씨 " + f +"이다.");
	}

}
