package 파일클래스;

import java.io.File;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		
		File file = new File(".");
		
		System.out.println(file.getAbsolutePath()); //현재 파일 위치
		System.out.println(file.getCanonicalPath());//현재 프로젝트 폴더 위치

	}

}
