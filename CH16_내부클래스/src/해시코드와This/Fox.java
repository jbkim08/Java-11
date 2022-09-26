package 해시코드와This;

public class Fox {

	public String name;
	
	public Fox() {
		//생성된 이 객체가 this
		System.out.println(this);
		this.name = "폭스";
	}
}
