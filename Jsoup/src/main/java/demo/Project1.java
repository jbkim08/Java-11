package demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Project1 {
	public static void main(String[] args) {
		// 네이버 스포츠 뉴스 주요뉴스 제목
		String url = "https://sports.news.naver.com/wfootball/index";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get(); //해당주소 사이트의 html문서
		} catch (Exception e) {
			e.printStackTrace();
		}
		//선택한 태그및 자식태그들 포함
		Elements elements = doc.select("div.home_news");
		//System.out.println(elements.toString());
		//제목글자만 가져오기
		String title = elements.select("h2").text();
		System.out.println("===============================");
		System.out.println(title);
		System.out.println("===============================");
		
		// li태그들중 1개의 li를 반복해서 내용을 출력
		for (Element el : elements.select("li")) {
			System.out.println(el.text());
		}
		System.out.println("===============================");

	}

}
