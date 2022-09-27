package 텍스트읽고쓰기;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
	public static void main(String[] args) throws IOException {
		
		String text = "헬로우! \n 하 와 유? \n한줄 더쓰기";
		
		Path path = Paths.get("D:\\JAVA\\b.txt"); //절대경로,상대경로
		
		//파일 쓰기 write(파일의경로, 바이트데이터)
		Files.write(path, text.getBytes());
		
		
		//path = Paths.get("D:\\JAVA\\a.txt");
		//파일 읽기
		//String recivedText = Files.readString(path);
		//System.out.println(recivedText);
		
	}
}
