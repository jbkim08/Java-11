package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// == , !=, !, &&, ||
		
		boolean isRaining = false; //비가오는가?
		boolean haveUmbrella = true; //우산을가짐?
		
		boolean takeUmbrella = false; //우산을쓰나?
		//1
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
		}
		System.out.println("첫번째 : "+takeUmbrella);
		//2
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		
		System.out.println("두번째 : "+takeUmbrella);
		//3
		takeUmbrella = isRaining && haveUmbrella ? true: false;
		System.out.println("세번째 : "+takeUmbrella);
	}

}
