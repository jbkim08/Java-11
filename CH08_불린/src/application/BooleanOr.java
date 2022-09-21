package application;

public class BooleanOr {
	public static void main(String[] args) {
		// == , !=, !, &&, ||

		boolean isRaining = false; // 비가오는가?
		boolean mightRain = true; // 비가올수도있는가?
		boolean takeUmbrella = false; // 우산을쓴다?

		takeUmbrella = isRaining || mightRain;

		System.out.println(takeUmbrella);

	}

}
