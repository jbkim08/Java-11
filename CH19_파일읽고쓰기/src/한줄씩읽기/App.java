package 한줄씩읽기;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 파일이 있는지 확인
		String fileLocation = "D:\\JAVA\\java-work\\CH19_파일읽고쓰기\\text.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
		//try-with-resources 자동으로 객체를 close 한다.
		try(BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {		
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}		
		} catch (FileNotFoundException e) {
			System.out.println("파일을 못찾음 : " + fileLocation);
		} catch (IOException e) {
			System.out.println("파일을 읽지못함: " + fileLocation);
		}
		
		
	}

}
