package 메소드;

public class DatingApp {
	public static void main(String[] args) {
		// 평가
		String x = rating(4.2, 4.7, 4.3);
		String y = rating(3.8, 4.1, 3.5);
		String z = rating(3.6, 3.0, 3.4);

		// 출력
		System.out.printf("X -> %s등급\n", x);
		System.out.printf("Y -> %s등급\n", y);
		System.out.printf("Z -> %s등급\n", z);
	}

	public static String rating(double personality, double look, double ability) {
		// 변수 생성
		String result = "";
		double sum = personality + look + ability;

		// 조건에 따른 등급 결정
		if (personality >= 4.0 && look >= 4.0 && ability >= 4.0) {
			result = "A";
		} else if ((sum >= 10) && (personality >= 4.0 || look >= 4.0 || ability >= 4.0)) {
			result = "B";
		} else {
			result = "C";
		}

		// 결과 반환
		return result;
	}
}