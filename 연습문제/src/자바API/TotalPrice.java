package 자바API;

import java.util.ArrayList;

public class TotalPrice {
	public static void main(String[] args) {
		/* 1. 구매 상품 객체를 생성하세요. */
		Item item1 = new Item("스트라이프 셔츠", 49900);
		Item item2 = new Item("슬림 면바지", 58900);
		Item item3 = new Item("스니커즈", 46900);
		/* 2. 장바구니에 상품을 담으세요. */
		Cart myCart = new Cart();
		myCart.add(item1);
		myCart.add(item2);
		myCart.add(item3);

		// 총합 출력
		System.out.printf("총합: %d원", myCart.totalPrice());
	}
}

class Cart {
	private ArrayList<Item> list;

	public Cart() {
		this.list = new ArrayList<Item>();
	}

	public void add(Item item) {
		list.add(item);
	}

	/* 3. 장바구니 총합 메소드를 완성하세요. */
	public int totalPrice() {
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum= sum + list.get(i).getPrice();
		}
		return sum;
	}
}

class Item {
	private String name;
	private int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}
