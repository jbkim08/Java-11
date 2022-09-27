package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> numbers = new ArrayList<>();
		while(true) {
			System.out.print("숫자 또는 'q' 입력 > ");
			String input = scanner.nextLine().trim();
			if(input.equalsIgnoreCase("q")) break; //q나Q면 종료
						
			try {
				double value = Double.parseDouble(input);
				numbers.add(value); //숫자가 맞으면 리스트에 입력한다.
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다!");
			}						
		}
				
		System.out.println();
		if(numbers.isEmpty()) { //리스트에 아이템이 없을때 참
			System.out.println("입력된 숫자가 없습니다.");
		} else {
			System.out.println("입력된 숫자 : ");
			double total = 0;
			for(Double n : numbers) {
				System.out.printf("%.2f\n", n);
				total += n;
			}
			
			System.out.printf("평균값 : %.2f", total/numbers.size());
		}
		
	}

}







