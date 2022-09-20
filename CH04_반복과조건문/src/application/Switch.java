package application;

public class Switch {

	public static void main(String[] args) {
		// 스위치문 
		int option = 1;
		
		switch(option) {
		case 0:
			System.out.println("옵션 0 선택.");
			break; //종료
		case 1:
			System.out.println("옵션 1 선택.");
			break; //종료
		case 10:
			System.out.println("옵션 10 선택.");
			break; //종료
		default:
			System.out.println("없는 옵션입니다.");
			break;
		}

	}

}
