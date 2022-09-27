package 한줄씩쓰기;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		String fileLocation = "D:\\JAVA\\java-work\\CH19_파일읽고쓰기\\text.txt";
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation))) {
			br.write("오렌지");
			br.newLine();
			br.write("사과");
			br.newLine();
			br.write("바나나");
		} catch (IOException e) {
			System.out.println("파일을 쓸수 없음 : " + fileLocation);
		}
		
		System.out.println("파일 쓰기 완료 : " + fileLocation);
	}

}
