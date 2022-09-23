package 클래스;

public class AccountTest {
	public static void main(String[] args) {
		// 객체 생성
		Account a = new Account("123-45", 10000);
		Account b = new Account("567-89", 10000);

		// 송금: 3천원씩 a 계좌에서 -> b계좌로!
		boolean result = true;
		while (result) {
			result = a.transfer(b, 3000);
		}

		// 결과 출력
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
}

class Account {
	String num; // 계좌번호
	int balance; // 잔액

	public Account(String str, int i) {
		num = str;
		balance = i;
	}

	public String toString() {
		return String.format("Account { num: %s, balance: %d }", num, balance);
	}

	public boolean transfer(Account target, int amount) {
		/* 1. 잔액이 부족한 경우 false를 반환하세요. */
	    if (balance < amount) {
	      return false; //계좌에 이체가능한 돈이 없을 경우에 false 리턴 
	    }
	    
	    /* 2. 현재 잔액에서 송금액을 이체대상 계좌로 전달하세요. */
	    balance -= amount;
	    target.balance += amount;
	    return true;  //이체했음
	  }
}
