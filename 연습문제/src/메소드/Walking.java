package 메소드;

public class Walking {
	public static void main(String[] args) {
		/* 1. 칼로리 계산을 위해 메소드를 호출하시오. */
		double result = calorieCalculator(5000); //5000걸음 입력
		/* 3. 결과를 출력하시오. */
		System.out.println("소모칼로리: " + result + " kcal");
	}

	/* 2. 칼로리 계산 메소드를 정의하시오. */
	public static double calorieCalculator(int walk) {
		return walk * 0.02;
	}
}
