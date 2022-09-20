package 자바시작하기;

public class Income {

	public static void main(String[] args) {
		
		double total = 8.62 + 10.23 + 12.48 + 7.82 + 9.54;
		
		//System.out.println("$" + total);
		//printf 출력양식을 지정가능
		System.out.printf("$ %.2f", total);
	}
}
