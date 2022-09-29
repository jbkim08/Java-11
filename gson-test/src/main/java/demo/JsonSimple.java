package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimple {

	public static void main(String[] args) throws IOException, ParseException {
        StringBuilder urlBuilder = new StringBuilder("https://api.odcloud.kr/api/15077586/v1/centers"); /*Base주소*/
        urlBuilder.append("?serviceKey=" + "982NxEgdH6thK%2FZDz70UrCfhK7oAZbmNwMC5vj%2Ftc9p7MhU5F9xBeJD47SMMIMfpvUbADVmpJPpZzqFqZDVwPg%3D%3D"); /*Service Key*/
        urlBuilder.append("&page=1"); /*페이지번호*/
        urlBuilder.append("&perPage=10"); /*한 페이지 결과 수*/
        
        URL url = new URL(urlBuilder.toString()); //주소로 URL객체 생성
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET"); //요청메소드 get
        conn.setRequestProperty("Content-type", "application/json");//데이터 타입 json
        //System.out.println("Response code: " + conn.getResponseCode());
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
        //System.out.println(sb.toString());
        JSONParser jsonParser = new JSONParser(); //제이슨 변환 객체
        JSONObject jsonObject = (JSONObject)jsonParser.parse(sb.toString());
        JSONArray arr = (JSONArray)jsonObject.get("data");
        //System.out.println(arr);
        for(Object one : arr) {
        	JSONObject ob = (JSONObject)one;
        	System.out.print(ob.get("id") + "\t");
        	System.out.print(ob.get("facilityName") + "\t");
        	System.out.print(ob.get("address") + "\t");
        	System.out.print(ob.get("org") + "\t");
        	System.out.print(ob.get("createdAt") + "\t");
        	System.out.println(ob.get("phoneNumber"));
        }
	}

}
