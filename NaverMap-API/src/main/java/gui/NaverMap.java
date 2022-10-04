package gui;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class NaverMap {
	
	MainFrame mainFrame;
	private static String clientID = "omcmy4brbg";
	private static String secretKey = "fEzstawjhbrab8ch9c2LUCzY7MJoYrN0KDbcJ6gG";
	
	public NaverMap(MainFrame mainFrame) throws IOException, ParseException {
		this.mainFrame = mainFrame;
		//주소입력창의 주소가져오기
		String address = mainFrame.address.getText();
		//System.out.println(address);
		StringBuilder urlBuilder = new StringBuilder(
				"https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=");
		urlBuilder.append(URLEncoder.encode(address, "UTF-8")); // 한글 주소를 utf-8로 인코딩해서 요청

		URL url = new URL(urlBuilder.toString()); // URL 주소 객체 생성
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// 연결설정
		conn.setRequestMethod("GET"); // 요청방법 "GET"
		conn.setRequestProperty("Content-type", "application/json");
		conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientID);
		conn.setRequestProperty("X-NCP-APIGW-API-KEY", secretKey);

		BufferedReader br;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		br.close();
		conn.disconnect();
		// System.out.println(sb.toString());
		JSONParser jsonParser = new JSONParser(); // 제이슨 변환 객체
		JSONObject jsonObject = (JSONObject) jsonParser.parse(sb.toString());
		//JSONObject ob1 = (JSONObject) jsonObject.get("");
		JSONArray arr = (JSONArray) jsonObject.get("addresses");

		for (Object one : arr) {
			JSONObject ob = (JSONObject) one;
			// System.out.println(employee.toString());
			System.out.println("address:" + ob.get("roadAddress"));
			System.out.println("jibunAddress:" + ob.get("jibunAddress"));
			System.out.println("경도:" + ob.get("x"));
			System.out.println("위도:" + ob.get("y"));

			AddressVO vo = new AddressVO();
			vo.setRoadAddress((String) ob.get("roadAddress"));
			vo.setJibunAddress((String) ob.get("jibunAddress"));
			vo.setX((String) ob.get("x"));
			vo.setY((String) ob.get("y"));
			
			mapService(vo);
		}
	}

	private void mapService(AddressVO vo) throws IOException {
		// 위도,경도 값을 가지고 지도이미지를 받아오기
		String mapUrl = "https://naveropenapi.apigw.ntruss.com/map-static/v2/raster?";
		String pos = URLEncoder.encode(vo.getX() + " " + vo.getY(), "UTF-8");
		mapUrl += "center=" + vo.getX() + "," + vo.getY();
		mapUrl += "&level=16&w=700&h=500";
		mapUrl += "&markers=type:t|size:mid|pos:" + pos + "|label:" + URLEncoder.encode(vo.getRoadAddress(), "UTF-8");

		URL url = new URL(mapUrl);

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// 연결설정
		conn.setRequestMethod("GET"); // 요청방법 "GET"

		conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientID);
		conn.setRequestProperty("X-NCP-APIGW-API-KEY", secretKey);

		int responseCode = conn.getResponseCode();

		if (responseCode == 200) { // http 상태 정상일때
			InputStream is = conn.getInputStream(); // 이미지 받기위한 입력스트림
            Image image = ImageIO.read(is); //이미지 객체생성
			is.close();
			ImageIcon imageIcon = new ImageIcon(image);
			mainFrame.imageLabel.setIcon(imageIcon); //라벨에 이미지아이콘입력
			mainFrame.resAddress.setText(vo.getRoadAddress());
			mainFrame.jibunAddress.setText(vo.getJibunAddress());
			mainFrame.resX.setText(vo.getX());
			mainFrame.resY.setText(vo.getY());
			
		} else { // 에러 발생
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();
			conn.disconnect();
			System.out.println(response.toString());
		}			
	}

	
}
