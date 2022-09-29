package demo;

import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ParsingJson {
	public static void main(String[] args) {
		
		String src = "info.json";
		// 파일에서 제이슨데이터를 가져옴(파싱)
		InputStream is = ParsingJson.class.getResourceAsStream(src);
		
		if(is == null) {
			throw new NullPointerException("파일이 없음");
		}
		
		JSONTokener tokener = new JSONTokener(is); //제이슨 데이터를 tokener에 넣기
		JSONObject object = new JSONObject(tokener);// 제이슨 객체 변환
		//System.out.println(object.toString());
		JSONArray employees = object.getJSONArray("employees");
		
		for (Object emp : employees) {
			JSONObject employee = (JSONObject)emp;
			//System.out.println(employee.toString());
			System.out.print(employee.get("id") + "\t");
			System.out.print(employee.get("name") + "\t");
			System.out.println(employee.get("email"));
		}
		
		
		

	}

}
