package 배열과반복;

public class DailyUser {
	public static void main(String[] args) {
		// 배열 생성
		int[] users = { 581, 512, 527, 495, 423, 141, 236 };
		// 총 유저 계산
		double totalUsers = sum(users);
		System.out.printf("총 사용자: %.0f명\n", totalUsers);
		// 평균 유저 계산
		double dailyUser = average(totalUsers, users.length);
		System.out.printf("하루 평균 사용자: %.2f명", dailyUser);
	}

	// 총합을 구하는 메소드
	public static double sum(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// 정수 배열을 입력받아, 평균을 반환
	public static double average(double sum, int count) {
		return sum / count;
	}
}
