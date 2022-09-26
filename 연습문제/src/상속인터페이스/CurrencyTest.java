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
class Currency{
	private double amount;   // 값
	private String notation; // 표기법

	public Currency(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}
	public double getAmount() {
		return amount;
	}
}

class KRW extends Currency{
	public KRW(double amount, String notation) {
		super(amount, notation);
	}
	@Override
	public String toString() {
		return String.format("KRW: %.2f 원",super.getAmount());
	}
}
class USD extends Currency{
	public USD(double amount, String notation) {
		super(amount, notation);
	}
	public String toString() {
		return String.format("USD: %.2f 달러",super.getAmount());
	}
}
class EUR extends Currency{
	public EUR(double amount, String notation) {
		super(amount, notation);
	}
	public String toString() {
		return String.format("EUR: %.2f 유로",super.getAmount());
	}
}
class JPY extends Currency{
	public JPY(double amount, String notation) {
		super(amount, notation);
	}
	public String toString() {
		return String.format("JPY: %.2f 엔",super.getAmount());
	}
}

