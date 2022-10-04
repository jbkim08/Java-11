package demo;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Project3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("종목코드 : ");
		String stockCode = scanner.nextLine().trim();
				
		String url = "https://finance.naver.com/item/main.nhn?code="+stockCode;
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get(); //해당주소 사이트의 html문서
		} catch (Exception e) {
			e.printStackTrace();
		}
		//종목의 여러가지 정보들 태그들
		Elements todaylist  = doc.select(".new_totalinfo dl>dd");
		//시간,종목,주가,등락폭,시가,고가,저가,거래량
		String time = todaylist.get(0).text();  //첫번째 dd태그 날짜시간
		String name = todaylist.get(1).text();  //두번째 dd태그 종목명
		String juga = todaylist.get(3).text().split(" ")[1]; //주가
		String dungRakrate = todaylist.get(3).text().split(" ")[6];
		String siga = todaylist.get(5).text().split(" ")[1];
		String goga = todaylist.get(6).text().split(" ")[1];
		String zeoga = todaylist.get(8).text().split(" ")[1];
		String georaeryang = todaylist.get(10).text().split(" ")[1];
		// 상한가,상승,보합,하한가,하락 구분
		String stype = todaylist.get(3).text().split(" ")[3]; 
		// 어제가격과 비교
		String vsYesterday = todaylist.get(3).text().split(" ")[4];

		System.out.printf("============== %s ================\n", name); // 종목명
		System.out.println("주가:" + juga);
		System.out.println("등락률:" + dungRakrate + "%");
		System.out.println("시가:" + siga);
		System.out.println("고가:" + goga);
		System.out.println("저가:" + zeoga);
		System.out.println("거래량:" + georaeryang);
		System.out.println("타입:" + stype);
		System.out.println("전일대비:" + vsYesterday);
		System.out.println("가져오는 시간:" + time);
	}

}
