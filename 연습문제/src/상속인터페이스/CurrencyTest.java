package 상속인터페이스;

public class CurrencyTest {
	public static void main(String[] args) {
		// 객체 생성
		KRW krw = new KRW(1500, "원");
		USD usd = new USD(100.50, "달러");
		EUR eur = new EUR(260.87, "유로");
		JPY jpy = new JPY(1400, "엔");

		// 부모 클래스를 통한 그룹화
		Currency[] currencies = { krw, usd, eur, jpy };

		// 모든 화폐정보를 출력
		for (Currency c : currencies) {
			System.out.println(c.toString());
		}
	}
}

/* 1. 부모 클래스 Currency를 만드시오. */
class Currency {
	private double amount; // 값
	private String notation; // 표기법

	public Currency(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}

	@Override
	public String toString() {
		return String.format("%s: %.2f %s", getClass().getSimpleName(), amount, notation);
	}
}

class KRW extends Currency {
	public KRW(double amount, String notation) {
		super(amount, notation);
	}
}

class USD extends Currency {
	public USD(double amount, String notation) {
		super(amount, notation);
	}
}

class EUR extends Currency {
	public EUR(double amount, String notation) {
		super(amount, notation);
	}
}

class JPY extends Currency {
	public JPY(double amount, String notation) {
		super(amount, notation);
	}
}
