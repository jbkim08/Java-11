package application;

public class RegexPractice {
	public static void main(String[] args) {
		// 정규표현식
		System.out.println("Cat".matches("[Cc]at"));
		System.out.println("Cat".matches("[a-zA-Z]at"));
		System.out.println("CAT".toLowerCase().matches("cat"));
		
		// 전화번호 형식이 맞는 체크한다. (010)-\d{3,4}-\d{4}
		boolean check = "010-1234-1234".matches("(010)-\\d{3,4}-\\d{4}");
		System.out.println("전화번호 체크 : " + check);
		
		// 이메일 형식이 맞는지 체크 \w+@\w+\.\w+
		check = "drv98@naver.com".matches("\\w+@\\w+\\.\\w+");
		System.out.println("이메일 체크 : " + check);
	}

}




