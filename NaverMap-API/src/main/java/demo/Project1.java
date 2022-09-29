package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Project1 {
	public static void main(String[] args) throws IOException, ParseException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("주소를 입력: ");
		String address = scanner.nextLine();
		scanner.close();
		
		StringBuilder urlBuilder = new StringBuilder("https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=");
		urlBuilder.append(URLEncoder.encode(address,"UTF-8")); //한글 주소를 utf-8로 인코딩해서 요청
		
		URL url = new URL(urlBuilder.toString()); //URL 주소 객체 생성
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		//연결설정
		conn.setRequestMethod("GET"); //요청방법 "GET"
		conn.setRequestProperty("Content-type", "application/json");
		conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", "omcmy4brbg");
		conn.setRequestProperty("X-NCP-APIGW-API-KEY", "fEzstawjhbrab8ch9c2LUCzY7MJoYrN0KDbcJ6gG");
		
        BufferedReader br;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
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
        System.out.println(sb.toString());
        JSONParser jsonParser = new JSONParser(); //제이슨 변환 객체
        JSONObject jsonObject = (JSONObject)jsonParser.parse(sb.toString());
        JSONArray arr = (JSONArray)jsonObject.get("data");
	}

}




