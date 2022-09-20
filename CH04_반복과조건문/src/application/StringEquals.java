package application;

public class StringEquals {

	public static void main(String[] args) {
		// 문자열을 비교할때 사용하는 메소드(함수)
		String s1 = "apple";
		String s2 = "apple";
		String s3 = new String("apple"); //apple
		
		System.out.println(s3);
		//문자열 비교는 equals메소드를 사용!
		System.out.printf("두개의 문자열 일치: %b \n" , s1==s3);
		System.out.println("두개의 문자열 일치: " + s1.equals(s3));
		

	}

}
