package 자바API;

import java.util.StringTokenizer;

public class StrTokenTest {
	public static void main(String[] args) {
		int sum = 0;
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6", ",=");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			int n = 0;
			try {
				n = Integer.parseInt(token);
			}catch(NumberFormatException e) {
				// 정수가 아닌 경우 아무것도 하지 않고 그냥 넘어 간다.
			}
			sum += n;
		}
		System.out.println("합은 " + sum);
	}
}
