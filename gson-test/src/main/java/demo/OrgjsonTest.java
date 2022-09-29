package demo;

import org.json.JSONArray;
import org.json.JSONObject;

public class OrgjsonTest {

	public static void main(String[] args) {
//		JSONObject jo = new JSONObject();
//		jo.put("id", 1234);
//		jo.put("name", "길동");
//		jo.put("email", "gill@naver.com");
//		
//		System.out.println(jo.toString());
		
		Employee e1 = new Employee(1234, "길동", "gill@google.com");
		Employee e2 = new Employee(1235, "펭수", "peng@google.com");
		
		JSONObject jo1 = new JSONObject(e1);
		JSONObject jo2 = new JSONObject(e2);
		
		JSONArray employees = new JSONArray();
		employees.put(jo1);
		employees.put(jo2);
		
		JSONObject obj = new JSONObject();
		obj.put("employees", employees);
		
		System.out.println(obj.toString(2));

	}

}
