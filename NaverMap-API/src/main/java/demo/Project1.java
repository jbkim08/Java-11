package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Project1 {
	
	private static String clientID = "omcmy4brbg";
	private static String secretKey = "fEzstawjhbrab8ch9c2LUCzY7MJoYrN0KDbcJ6gG";
	
	public static void main(String[] args) throws IOException, ParseException {

		Scanner scanner = new Scanner(System.in);
		System.out.print("주소를 입력: ");
		String address = scanner.nextLine();
		scanner.close();

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
		JSONArray arr = (JSONArray) jsonObject.get("addresses");

		for (Object one : arr) {
			JSONObject ob = (JSONObject) one;
			// System.out.println(employee.toString());
			System.out.println("address:" + ob.get("roadAddress"));
			System.out.println("jibunAddress:" + ob.get("jibunAddress"));
			System.out.println("경도:" + ob.get("x"));
			System.out.println("위도:" + ob.get("y"));

			String x = (String) ob.get("x");
			String y = (String) ob.get("y");
			String z = (String) ob.get("roadAddress");

			mapService(x, y, z);
		}
	}

	private static void mapService(String x, String y, String address) throws IOException {
		// 위도,경도 값을 가지고 지도이미지를 받아오기
		String mapUrl = "https://naveropenapi.apigw.ntruss.com/map-static/v2/raster?";
		String pos = URLEncoder.encode(x + " " + y, "UTF-8");
		mapUrl += "center=" + x + "," + y;
		mapUrl += "&level=16&w=700&h=500";
		mapUrl += "&markers=type:t|size:mid|pos:" + pos +"|label:" + URLEncoder.encode(address, "UTF-8");
		
		URL url = new URL(mapUrl);
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// 연결설정
		conn.setRequestMethod("GET"); // 요청방법 "GET"
		
		conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientID);
		conn.setRequestProperty("X-NCP-APIGW-API-KEY", secretKey);
		
		int responseCode = conn.getResponseCode();
		
		if(responseCode == 200) { //http 상태 정상일때
			InputStream is = conn.getInputStream(); //이미지 받기위한 입력스트림
			byte[] bytes = new byte[1024];
			//랜덤 이미지 파일이름
			String time = Long.valueOf(new Date().getTime()).toString();
			File f = new File(time + ".jpg"); //파일이름을 시간으로 생성
			f.createNewFile(); //파일 생성
			OutputStream outputStream = new FileOutputStream(f);
			int read = 0;
			while((read = is.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
			outputStream.close();
			is.close();
		}

	}

}



