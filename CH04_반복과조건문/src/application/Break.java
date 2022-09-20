package application;

public class Break {

	public static void main(String[] args) {
		// 반복문 빠져나오기
		int count = 0;
		
		while(true) {
			System.out.println("헬로우. " + count);
			
			if(count == 5) {
				break; //반복문 나오기
			}
			
			System.out.println("하와유~");
			count++;
		}
		
		System.out.println("프로그램 종료!");

	}

}
