package 파일클래스;

import java.io.File;

public class Location {

	public static void main(String[] args) {
		// 파일이 있는지 확인
		String fileLocation = "D:\\JAVA\\java-work\\CH19_파일읽고쓰기\\text.txt";
		System.out.println(new File(fileLocation).exists());

	}

}
