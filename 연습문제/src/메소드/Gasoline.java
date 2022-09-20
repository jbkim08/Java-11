package 메소드;

public class Gasoline {
	  public static void main(String[] args) {
	    double gasoline = 8.86;
	    double distance = 182.736;
	    double efficiency = calcEffiency(gasoline, distance);
	    System.out.printf("연비: %.2f km/L", efficiency);
	  }
	  
	  public static double calcEffiency(double fuel, double distance) {
	    /* 해당 메소드를 구현 하세요 */
	    return distance/fuel;
	  }
	}
