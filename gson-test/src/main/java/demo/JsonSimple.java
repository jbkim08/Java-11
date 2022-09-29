package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class JsonSimple {

	public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("https://api.odcloud.kr/api/15077586/v1/centers"); /*Base주소*/
        urlBuilder.append("?serviceKey=" + "982NxEgdH6thK%2FZDz70UrCfhK7oAZbmNwMC5vj%2Ftc9p7MhU5F9xBeJD47SMMIMfpvUbADVmpJPpZzqFqZDVwPg%3D%3D"); /*Service Key*/
        urlBuilder.append("&page=1"); /*페이지번호*/
        urlBuilder.append("&perPage=10"); /*한 페이지 결과 수*/
        
        URL url = new URL(urlBuilder.toString()); //주소로 URL객체 생성
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
	}

}
