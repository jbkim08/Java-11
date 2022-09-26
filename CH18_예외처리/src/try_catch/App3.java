package try_catch;

import java.util.Scanner;
public class App3 {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number = getNumber();				
		System.out.println("입력한 숫자는 : " + number);
				
	}

	/**
	 * 숫자를 입력받아서 정수로 리턴, 숫자가 아닐시 반복
	 * @return int
	 */
	private static int getNumber() {
		
		int number = 0;
		boolean isNumber = false;
		
		do {
			System.out.print("숫자를 입력 : ");
			String line = scanner.nextLine();
					
			try { //예외 발생할 수 있는 코드 넣기
				number = Integer.parseInt(line);
				isNumber = true; //변환 성공(숫자맞음)
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해 주세요!");
			}	
		} while (!isNumber);
			
		return number;
	}

}
