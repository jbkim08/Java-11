package demo;

import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Project2 {

	public static void main(String[] args) {
		// http://www.cgv.co.kr/movies/
		String url = "http://www.cgv.co.kr/movies/";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get(); //해당주소 사이트의 html문서
		} catch (Exception e) {
			e.printStackTrace();
		}
		//선택한 태그및 자식태그들 포함
		Elements elements = doc.select("div.sect-movie-chart");
		
		System.out.println("============================================================");
		
		//Iterator를 사용해 순서대로 저장하기
		// el1 순위들을 저장 , el2는 제목을 저장
		Iterator<Element> el1 = elements.select("strong.rank").iterator();
		Iterator<Element> el2 = elements.select("strong.title").iterator();
		
		// hasNext()다음 객체가 있으면 true 없으면 false로 다음객체가 없으면 반복문 종료
		while(el1.hasNext()) {
			//next()다음 객체를 선택
			System.out.println(el1.next().text() + "\t" + el2.next().text());
		}
		
		System.out.println("============================================================");
	}

}
