package application;

public class BooleanAndOr {
	public static void main(String[] args) {
		// == , !=, !, &&, ||
		
		boolean isRaining = true; //비가오나?
		boolean mightRain = false; //올수도 있나?
		boolean haveUmbrella = true; //우산이 있음
		
		if((isRaining || mightRain) && haveUmbrella) {
			System.out.println("우산을 쓴다!");
		}
		else {
			System.out.println("우산을 쓰지 않는다.");
		}
		
		boolean rainCheck = isRaining || mightRain;
		
		if(rainCheck && haveUmbrella) {
			System.out.println("우산을 쓴다!");
		}
		else {
			System.out.println("우산을 쓰지 않는다.");
		}

	}

}
