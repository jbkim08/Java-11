package demo;

import com.google.gson.Gson;

public class App {

	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
//		Employee emp = new Employee(1234, "길동", "gill@googole.com");
//		String jsonString = gson.toJson(emp);
//		System.out.println(jsonString);
		
		String jsonString = "{\"id\":1234,\"name\":\"길동\",\"email\":\"gill@googole.com\"}";
		Employee emp = gson.fromJson(jsonString, Employee.class);
		System.out.println(emp);
	}

}
