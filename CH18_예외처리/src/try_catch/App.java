package try_catch;

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력 : ");
		String line = scanner.nextLine();
		
		int number = 0;
		boolean isNumber = false;
		
		try { //예외 발생할 수 있는 코드 넣기
			number = Integer.parseInt(line);
			isNumber = true; //변환 성공(숫자맞음)
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해 주세요!");
		}	
		
		if(isNumber) {
			System.out.println("입력한 숫자는 : " + number);
		}
		
	}

}
