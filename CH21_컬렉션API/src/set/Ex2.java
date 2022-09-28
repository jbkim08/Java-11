package set;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Ex2 {

	public static void main(String[] args) {
		// 책.txt를 다운로드하여 중복되지 않은 단어를 순서대로 출력하자.
		File aliceBook = new File("alice.txt"); //상대경로
		System.out.println(aliceBook.exists());
		TreeSet<String> alice = loadWords(aliceBook);
		
		System.out.println(alice.size()); //단어의 갯수
				
	}
	/**
	 * txt책을 읽어서 모든 단어를 트리셋에 담어서 리턴
	 * @param 파일객체
	 * @return TreeSet<String> 단어리스트
	 */
	private static TreeSet<String> loadWords(File file) {
		// 1. 파일을 읽기 2.트리셋리스트에 단어추가 3.리턴 트리셋
		TreeSet<String> wordSet = new TreeSet<>();
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while((line = br.readLine()) != null) {
				String[] words = line.split("[^a-zA-Z]+");
				for(String word: words) {
					wordSet.add(word); //트리셋에 단어를 하나씩 추가
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일찾지못함");
		} catch (IOException e1) {
			System.out.println("파일을읽지못함");
		}
		return wordSet;
	}

}



