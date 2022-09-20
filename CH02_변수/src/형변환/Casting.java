package 형변환;

public class Casting {

	public static void main(String[] args) {
		// 1.자동변환 2.명시적 변환
		//자동변환
		byte a = 32; //정수 -127 ~ 128
		
		short b = a; // byte가 short로 자동변환
		
		int c = b; //short가 int로 자동변환
		
		long d = c; //int가 long 자동변환
		
		System.out.println(d);
		
		//명시적 변환 (직접 변환: 변환할 타입으로 (타입) )
		long l = 100000; //
		
		int g = (int)l; //롱을 int로 직접변환 범위를 벗어나면 데이터 깨진다.
		
		System.out.println(g);
		
		

	}

}
